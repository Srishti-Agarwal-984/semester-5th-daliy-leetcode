// Last updated: 12/1/2025, 5:26:31 PM
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        if(n>batteries.length){
4            return 0;
5        }
6
7        long totalSum = 0;
8        for (int b : batteries) totalSum += b;
9
10        long low = 0;
11        long high = totalSum / n + 1;  // upper bound
12
13        // Binary search for maximum time
14        while (low < high) {
15            long mid = low + (high - low + 1) / 2;
16
17            long actualPower = 0;
18            for (int b : batteries) {
19                actualPower += Math.min((long) b, mid);
20            }
21
22            // check feasibility
23            if (actualPower >= n * mid) {
24                low = mid;       // possible → try higher
25            } else {
26                high = mid - 1;  // not possible → try lower
27            }
28        }
29        return low;
30    }
31}
32
33
34