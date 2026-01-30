// Last updated: 1/30/2026, 9:18:02 PM
1class Solution {
2    public int openLock(String[] deadends, String target) {
3        HashSet<String> st = new HashSet<>();
4        for (String str : deadends) {
5            st.add(str);
6        }
7        if (st.contains("0000")) {
8            return -1;
9        }
10        Queue<String> q = new LinkedList<>();
11        q.add("0000");
12        int level = 0;
13        while (!q.isEmpty()) {
14            int n = q.size();
15            for (int i = 0; i < n; i++) {
16                String str = q.poll();
17                if (str.equals(target)) {
18                    return level;
19                } else {
20                    helper(q, st, str);
21                }
22            }
23            level++;
24        }
25        return -1;
26    }
27
28    public void helper(Queue<String> q, HashSet<String> st, String str) {
29        for (int i = 0; i < 4; i++) {
30            char[] arr = str.toCharArray();
31            char inc = (arr[i] == '9') ? '0' : (char) (arr[i] + 1);
32            char dec = (arr[i] == '0') ? '9' : (char) (arr[i] - 1);
33
34            arr[i] = inc;
35            String newarr1 = new String(arr);
36            arr[i] = dec;
37            String newarr2 = new String(arr);
38            if (!st.contains(newarr1)) {
39                st.add(newarr1);
40                q.add(newarr1);
41            }
42            if (!st.contains(newarr2)) {
43                st.add(newarr2);
44                q.add(newarr2);
45            }
46        }
47    }
48}