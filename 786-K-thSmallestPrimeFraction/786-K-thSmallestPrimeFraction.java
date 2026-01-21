// Last updated: 1/21/2026, 5:02:16 PM
1class Solution {
2    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
3        PriorityQueue<Pair> pq = new PriorityQueue<>(
4            (a, b) -> Double.compare(b.f, a.f) // max heap
5        );
6
7        for (int i = 0; i < arr.length; i++) {
8            for (int j = i + 1; j < arr.length; j++) {
9                double val = (double) arr[i] / arr[j];
10                pq.add(new Pair(arr[i], arr[j], val));
11
12                if (pq.size() > k) {
13                    pq.poll();
14                }
15            }
16        }
17
18        Pair res = pq.peek();
19        return new int[]{res.n1, res.n2};
20    }
21
22    class Pair {
23        int n1, n2;
24        double f;
25        Pair(int n1, int n2, double f) {
26            this.n1 = n1;
27            this.n2 = n2;
28            this.f = f;
29        }
30    }
31}
32