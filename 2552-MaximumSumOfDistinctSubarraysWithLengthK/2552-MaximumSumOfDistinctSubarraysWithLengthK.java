// Last updated: 7/31/2025, 5:28:27 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum=0, ans=0;
        int si=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum=sum+nums[i];
            while(map.get(nums[i])>1 && si<=i){
                sum=sum-nums[si];
                map.put(nums[si],map.get(nums[si])-1);
                if(map.get(nums[si])==0){
                    map.remove(nums[si]);
                }
                si++;
            }
            if(map.size()==k){
                ans=Math.max(ans, sum);
                sum=sum-nums[si];
                map.remove(nums[si]);
                si++;
            }
        }
        return ans;
    }
}