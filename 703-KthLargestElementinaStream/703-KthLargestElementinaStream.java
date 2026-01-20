// Last updated: 1/20/2026, 10:51:07 AM
1class KthLargest {
2    PriorityQueue<Integer> pq = new PriorityQueue<>();
3    int k;
4    public KthLargest(int k, int[] nums) {
5        pq.clear();
6        this.k = k;
7        for(int el : nums){
8            pq.add(el);
9        }
10    }
11    
12    public int add(int val) {
13        pq.add(val);
14        while(pq.size() > k){
15            pq.poll();
16        }
17        return pq.peek();
18    }
19}
20
21/**
22 * Your KthLargest object will be instantiated and called as such:
23 * KthLargest obj = new KthLargest(k, nums);
24 * int param_1 = obj.add(val);
25 */