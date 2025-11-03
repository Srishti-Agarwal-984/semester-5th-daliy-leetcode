// Last updated: 11/3/2025, 4:41:19 PM
class Solution {
    public int minStoneSum(int[] nums, int k) {
        int a =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;  // for max-heap
            }
        });
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        while(k>0){
            
        
            int r = pq.poll();
            int q=(r+1)/2;
            pq.add(q);
            k--;

        }
        while(!pq.isEmpty()){
            a+=pq.poll();
        }

        return a;
    }
}