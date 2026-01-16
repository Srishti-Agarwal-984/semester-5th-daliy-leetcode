// Last updated: 1/16/2026, 3:45:38 PM
1class Solution {
2    public List<String> subdomainVisits(String[] cpdomains) {
3        HashMap<String, Integer> map = new HashMap<>();
4
5        for (String s : cpdomains) {
6            String[] arr = s.split(" ");
7            int cal = Integer.parseInt(arr[0]);
8
9            // FIX HERE
10            String[] qw = arr[1].split("\\.");
11
12            map.put(qw[qw.length - 1],
13                    map.getOrDefault(qw[qw.length - 1], 0) + cal);
14
15            for (int i = qw.length - 2; i >= 0; i--) {
16                qw[i] = qw[i] + "." + qw[i + 1];
17                map.put(qw[i], map.getOrDefault(qw[i], 0) + cal);
18            }
19        }
20
21        List<String> ans = new ArrayList<>();
22        for (String df : map.keySet()) {
23            ans.add(map.get(df) + " " + df);
24        }
25        return ans;
26    }
27}
28