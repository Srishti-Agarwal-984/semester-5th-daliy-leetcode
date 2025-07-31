// Last updated: 7/31/2025, 5:35:36 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int p=0;
        List<Integer> dq = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            while(dq.size()>=1 && (i-dq.get(0))>=k){
                dq.remove(0);
            }
            while(dq.size()>=1  && nums[dq.get(dq.size()-1)]<nums[i]){
                dq.remove(dq.size()-1);
            }
            dq.add(i);
            if(i>=k-1){
                ans[p++] = nums[dq.get(0)];
            }
        }
        return ans;


        
    }
}