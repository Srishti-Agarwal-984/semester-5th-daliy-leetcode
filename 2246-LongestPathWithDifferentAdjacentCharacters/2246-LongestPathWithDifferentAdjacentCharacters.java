// Last updated: 1/17/2026, 11:13:31 PM
1class Solution {
2    int ans = 1;
3
4    public int longestPath(int[] parent, String s) {
5        int n = parent.length;
6        Map<Integer, List<Integer>> map = new HashMap<>();
7
8        for (int i = 0; i < n; i++) {
9            map.put(i, new ArrayList<>());
10        }
11
12        for (int i = 1; i < n; i++) {
13            map.get(parent[i]).add(i);
14        }
15
16        dfs(map, s, 0);
17        return ans;
18    }
19
20    private int dfs(Map<Integer, List<Integer>> map, String s, int node) {
21        int best1 = 0, best2 = 0;
22
23        for (int child : map.get(node)) {
24            int len = dfs(map, s, child);
25
26            if (s.charAt(child) != s.charAt(node)) {
27                if (len > best1) {
28                    best2 = best1;
29                    best1 = len;
30                } else if (len > best2) {
31                    best2 = len;
32                }
33            }
34        }
35
36        ans = Math.max(ans, 1 + best1 + best2);
37        return 1 + best1;
38    }
39}
40