// Last updated: 11/11/2025, 10:30:57 AM
class Solution {
    public int minimumDistance(int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                if(p1.data==p2.data){
                    return p1.i-p2.i;
                }
                return p1.data-p2.data;
            }
        });
        for(int i1=0; i1<nums.length; i1++){
            pq.add(new Pair(nums[i1], i1));
        }
        int ans=Integer.MAX_VALUE;

        while(pq.size()>2){
            Pair p1 = pq.poll();
            Pair p2 = pq.poll();
            Pair p3 = pq.poll();
            if(p1.data==p2.data && p2.data==p3.data){
                ans=Math.min(ans, Math.abs(p1.i-p2.i)+Math.abs(p1.i-p3.i)+Math.abs(p3.i-p2.i));
                //System.out.println(Math.abs(p1.i));
            }
            pq.add(p2);
            pq.add(p3);
        }
        return ans==Integer.MAX_VALUE?-1: ans;
        
    }
    class Pair{
        
        int data;
        int i;
        public Pair( int data, int i){
            this.data=data;
            this.i=i;

        }
    }
}