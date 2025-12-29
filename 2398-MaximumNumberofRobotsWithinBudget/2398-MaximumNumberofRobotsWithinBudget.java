// Last updated: 12/29/2025, 5:25:03 PM
1class Solution {
2    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
3        long[] prefix = new long[runningCosts.length];
4        prefix[0]=runningCosts[0];
5        for(int i=1; i<runningCosts.length; i++){
6            prefix[i]=prefix[i-1]+runningCosts[i];
7        }
8        int r=0, en = runningCosts.length;
9        int ans = 0;
10        while(r<=en){
11            int mid = r+(en-r)/2;
12            if(helper(mid,prefix, chargeTimes, runningCosts, budget)){
13                ans = Math.max(ans, mid);
14                r =mid+1;
15            }
16            else{
17                en = mid-1;
18            }
19        }
20        return ans;
21
22        
23    }
24    public boolean helper(int temp, long[] prefix, int[] chargeTimes, int[] runningCosts, long budget){
25        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
26            @Override
27            public int compare(Pair p1, Pair p2){
28                return p2.val-p1.val;
29            }
30        });
31        if(temp==0){
32            return true;
33        }
34        int i=0;
35        for(i=0; i<temp; i++){
36            pq.add(new Pair(chargeTimes[i], i));
37        }
38        long q =pq.peek().val+prefix[temp-1]*temp;
39        if(q<=budget){
40            return true;
41        } 
42        for(int j=i; j<chargeTimes.length; j++){
43            pq.add(new Pair(chargeTimes[j], j)); 
44            while( pq.peek().idx<j-temp+1){
45                pq.poll();
46            }
47            long sum = prefix[j] - prefix[j - temp];
48            long q1 = pq.peek().val+temp*sum;
49            if(q1<=budget){
50                return true;
51            }
52        }
53        return false;
54
55
56    }
57    class Pair{
58        int val;
59        int idx;
60        public Pair(int val, int idx){
61            this.val  = val;
62            this.idx = idx;
63        }
64    }
65}