// Last updated: 11/12/2025, 6:46:05 AM
class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                if(p1.data==p2.data){
                    return p1.i-p2.i;
                }
                return p1.data-p2.data;
            }
        });
        for(int i=0; i<nums.length; i++){
            pq.add(new Pair(nums[i], i));
        }
        Set<Integer> st = new HashSet<>();
        long ans=0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            if(!st.contains(p.i)){
                ans+=p.data;
                st.add(p.i);
                if(p.i>0){
                    st.add(p.i-1);
                }
                if(p.i<nums.length-1){
                    st.add(p.i+1);
                }
            }
        }
        return ans;
    }
    class Pair{
        int data;
        int i;
        public Pair(int data, int i){
            this.data=data;
            this.i=i;
        }
    }
}