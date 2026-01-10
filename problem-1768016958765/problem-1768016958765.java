// Last updated: 1/10/2026, 9:19:18 AM
1class Solution {
2    public int[] avoidFlood(int[] rains) {
3
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5        HashMap<Integer, Queue<Integer>> map = new HashMap<>();
6
7        for (int i = 0; i < rains.length; i++) {
8            if (rains[i] != 0) {
9                if (!map.containsKey(rains[i])) {
10                    map.put(rains[i], new PriorityQueue<>());
11                }
12                map.get(rains[i]).add(i);
13            }
14        }
15
16        HashSet<Integer> st = new HashSet<>();
17        int[] ans = new int[rains.length];
18
19        for (int i = 0; i < rains.length; i++) {
20
21            if (rains[i] > 0) {
22                if (!pq.isEmpty() && pq.peek() == i) {
23                    pq.poll();
24                }
25
26                if (st.contains(rains[i])) {
27                    return new int[0];
28                }
29
30                st.add(rains[i]);
31                map.get(rains[i]).poll();
32
33                if (map.get(rains[i]).size() > 0) {
34                    pq.add(map.get(rains[i]).peek());
35                }
36
37                ans[i] = -1;
38            } 
39            else {
40                if (st.size() == 0) {
41                    ans[i] = 1;
42                } 
43                else {
44                    if (pq.size() > 0) {
45                        int idx = pq.poll();
46                        ans[i] = rains[idx];
47                        st.remove(ans[i]);
48                    } 
49                    else {
50                        for (int u : st) {
51                            ans[i] = u;
52                            break;
53                        }
54                        st.remove(ans[i]);
55                    }
56                }
57            }
58        }
59
60        return ans;
61    }
62}
63