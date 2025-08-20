// Last updated: 8/20/2025, 10:44:27 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int sum=0;
        while(pq.size()>=2 && pq.peek()<k){
            int a = pq.poll();
            int b=pq.poll();
            int u = Math.min(a,b)*2+Math.max(a,b);
            if(u<0){
                u=1000000000;
            }
            //System.out.println(u);
            pq.add(u);
            sum++;
        }
        return sum;
    }
}