// Last updated: 7/31/2025, 5:35:18 PM
class Solution {
    Set<String> result = new HashSet<>();
    int maxLen = -1;
    int minRemovals = Integer.MAX_VALUE;

    public List<String> removeInvalidParentheses(String s) {
        dfs(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(result);
    }

    public void dfs(String s, int i, int open, int close, StringBuilder sb, int removed) {
        if (i == s.length()) {
            if (open == close) {
                if (removed <= minRemovals) {
                    if (removed < minRemovals) {
                        result.clear();  // Found a better (smaller removal) result
                        minRemovals = removed;
                    }
                    result.add(sb.toString());
                }
            }
            return;
        }

        char c = s.charAt(i);
        int len = sb.length();

        // If it's a parenthesis, we can choose to remove it
        if (c == '(' || c == ')') {
            // Option 1: remove it
            dfs(s, i + 1, open, close, sb, removed + 1);
        }

        // Option 2: keep it
        sb.append(c);
        if (c != '(' && c != ')') {
            dfs(s, i + 1, open, close, sb, removed);  // Just move forward
        } else if (c == '(') {
            dfs(s, i + 1, open + 1, close, sb, removed);  // Add opening
        } else if (c == ')' && close < open) {
            dfs(s, i + 1, open, close + 1, sb, removed);  // Add closing only if valid
        }
        sb.setLength(len);  // backtrack
    }
}
