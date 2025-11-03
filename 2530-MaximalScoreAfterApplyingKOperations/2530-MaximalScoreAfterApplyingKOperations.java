// Last updated: 11/3/2025, 4:33:06 PM
class Solution {
    public long maxKelements(int[] nums, int k) {
        long a =0;
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
            a+=pq.peek();
        
            int r = pq.poll();
            int q=r/3;
            if(r%3>0){
                q++;
            }
            //System.out.println(q);
            pq.add(q);
            k--;

        }
        return a;

    }
}