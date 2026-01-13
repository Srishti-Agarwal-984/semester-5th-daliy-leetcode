// Last updated: 1/13/2026, 10:19:09 PM
1class Solution {
2    int i = 0;
3
4    public String countOfAtoms(String formula) {
5        TreeMap<String, Integer> map = helper(formula);
6        StringBuilder sb = new StringBuilder();
7        for (String key : map.keySet()) {
8            sb.append(key);
9            if (map.get(key) > 1) {
10                sb.append(map.get(key));
11            }
12        }
13        return sb.toString();
14    }
15
16    public TreeMap<String, Integer> helper(String formula) {
17        TreeMap<String, Integer> map = new TreeMap<>();
18        String s = "";
19        int p = 0;
20
21        while (i < formula.length() && formula.charAt(i) != ')') {
22
23            if (formula.charAt(i) == '(') {
24                if (!s.isEmpty()) {
25                    map.put(s, map.getOrDefault(s, 0) + 1);
26                    s = "";
27                }
28
29                i++; // skip '('
30                TreeMap<String, Integer> inner = helper(formula);
31                i++; // skip ')'
32
33                int t = 0;
34                while (i < formula.length() && formula.charAt(i) >= '0' && formula.charAt(i) <= '9') {
35                    t = t * 10 + (formula.charAt(i) - '0');
36                    i++;
37                }
38                if (t == 0) t = 1;
39
40                for (String key : inner.keySet()) {
41                    map.put(key, map.getOrDefault(key, 0) + inner.get(key) * t);
42                }
43            }
44
45            else if (formula.charAt(i) >= 'A' && formula.charAt(i) <= 'Z') {
46                if (!s.isEmpty()) {
47                    map.put(s, map.getOrDefault(s, 0) + 1);
48                }
49                s = "" + formula.charAt(i);
50                i++;
51            }
52
53            else if (formula.charAt(i) >= 'a' && formula.charAt(i) <= 'z') {
54                s += formula.charAt(i);
55                i++;
56            }
57
58            p = 0;
59            while (i < formula.length() && formula.charAt(i) >= '0' && formula.charAt(i) <= '9') {
60                p = p * 10 + (formula.charAt(i) - '0');
61                i++;
62            }
63
64            if (!s.isEmpty() && p > 0) {
65                map.put(s, map.getOrDefault(s, 0) + p);
66                s = "";
67            }
68        }
69
70        if (!s.isEmpty()) {
71            map.put(s, map.getOrDefault(s, 0) + 1);
72        }
73
74        return map;
75    }
76}
77