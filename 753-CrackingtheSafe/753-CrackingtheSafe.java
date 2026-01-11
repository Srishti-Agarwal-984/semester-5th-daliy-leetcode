// Last updated: 1/11/2026, 8:26:18 PM
1class Solution {
2    StringBuilder ans = new StringBuilder();
3    HashSet<String> seen = new HashSet<>();
4    int k, n;
5
6    public String crackSafe(int n, int k) {
7        this.n = n;
8        this.k = k;
9
10        String start = "0".repeat(n - 1);// n=3 ""00"
11        dfs(start);
12
13        ans.append(start);
14        return ans.toString();
15    }
16
17    // DP-style DFS (state = current node)
18    private void dfs(String node) {
19        for (int i = 0; i < k; i++) {
20            String edge = node + i;
21            if (!seen.contains(edge)) {
22                seen.add(edge);
23                dfs(edge.substring(1));
24                ans.append(i);
25            }
26        }
27    }
28}
29