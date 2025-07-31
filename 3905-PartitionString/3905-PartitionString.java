// Last updated: 7/31/2025, 5:25:39 PM
class Solution {
    public List<String> partitionString(String s) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            sb.append(ch);
            if (!set.contains(sb.toString())) {
                String str = sb.toString();
                res.add(str);
                set.add(str);
                sb.setLength(0); // clear StringBuilder
            }
        }

        return res;
    }
}