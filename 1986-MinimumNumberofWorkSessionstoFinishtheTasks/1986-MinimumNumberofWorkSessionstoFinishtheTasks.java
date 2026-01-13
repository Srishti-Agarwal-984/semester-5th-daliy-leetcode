// Last updated: 1/13/2026, 4:30:38 PM
1class Solution {
2    int ans = Integer.MAX_VALUE;
3
4    public int minSessions(int[] tasks, int sessionTime) {
5        Arrays.sort(tasks);
6       // reverse(tasks);
7        backtrack(tasks, 0, new int[tasks.length], 0, sessionTime);
8        return ans;
9    }
10
11    private void backtrack(int[] tasks, int idx, int[] sessions, int used, int st) {
12        if (used >= ans) return;
13
14        if (idx == tasks.length) {
15            ans = Math.min(ans, used);
16            return;
17        }
18
19        for (int i = 0; i < used; i++) {
20            if (sessions[i] + tasks[idx] <= st) {
21                sessions[i] += tasks[idx];
22                backtrack(tasks, idx + 1, sessions, used, st);
23                sessions[i] -= tasks[idx];
24            }
25        }
26
27        // open new session
28        sessions[used] = tasks[idx];
29        backtrack(tasks, idx + 1, sessions, used + 1, st);
30        sessions[used] = 0;
31    }
32
33    private void reverse(int[] a) {
34        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
35            int t = a[i]; a[i] = a[j]; a[j] = t;
36        }
37    }
38}
39