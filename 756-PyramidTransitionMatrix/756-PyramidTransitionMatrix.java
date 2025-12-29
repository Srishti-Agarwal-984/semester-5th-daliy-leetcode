// Last updated: 12/29/2025, 1:52:19 PM
1class Solution {
2    HashMap<String, List<Character>> map = new HashMap<>();
3
4    public boolean pyramidTransition(String bottom, List<String> allowed) {
5
6        // Build mapping: "AB" -> [C, D, ...]
7        for (String s : allowed) {
8            String key = s.substring(0, 2);
9            map.putIfAbsent(key, new ArrayList<>());
10            map.get(key).add(s.charAt(2));
11        }
12
13        return helper(bottom);
14    }
15
16    public boolean helper(String bottom) {
17        if (bottom.length() == 1) {
18            return true;
19        }
20
21        List<String> nextRows = maker(bottom, 0, new StringBuilder(), new ArrayList<>());
22
23        for (String s : nextRows) {
24            if (helper(s)) {
25                return true; // short-circuit
26            }
27        }
28        return false;
29    }
30
31    public List<String> maker(String bottom, int idx, StringBuilder sb, List<String> res) {
32        if (idx == bottom.length() - 1) {
33            res.add(sb.toString());
34            return res;
35        }
36
37        String key = bottom.substring(idx, idx + 2);
38        if (!map.containsKey(key)) return res;
39
40        for (char ch : map.get(key)) {
41            sb.append(ch);
42            maker(bottom, idx + 1, sb, res);
43            sb.deleteCharAt(sb.length() - 1); // backtrack
44        }
45        return res;
46    }
47}
48