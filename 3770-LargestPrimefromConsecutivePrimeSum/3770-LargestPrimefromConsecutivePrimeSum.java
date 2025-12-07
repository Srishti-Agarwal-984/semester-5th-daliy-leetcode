// Last updated: 12/7/2025, 9:43:15 AM
1class Solution {
2    public int largestPrime(int n) {
3        List<Integer> ans = new ArrayList<>();
4        int temp = n;
5        fun1(temp, ans);
6        int sum = 0, count = 0;
7        for(int p : ans) {
8            sum += p;
9            if(sum > n) break;
10            if(fun2(sum)) count = sum;
11        }
12        return count;
13    }
14    void fun1(int n, List<Integer> list) {
15        boolean[] b = new boolean[n + 1];
16        Arrays.fill(b, true);
17        if(n >= 0) b[0] = false;
18        if(n >= 1) b[1] = false;
19        for(int i = 2; i * i <= n; i++) {
20            if(b[i]) {
21                for(int j = i * i; j <= n; j += i) {
22                    b[j] = false;
23                }
24            }
25        }
26        for(int i = 2; i <= n; i++) {
27            if(b[i]) list.add(i);
28        }
29    }
30    boolean fun2(int n) {
31        if(n < 2) return false;
32        if(n == 2 || n == 3) return true;
33        if(n % 2 == 0 || n % 3 == 0) return false;
34        for(int i = 5; i * i <= n; i += 6) {
35            if(n % i == 0 || n % (i + 2) == 0) return false;
36        }
37        return true;
38    }
39}