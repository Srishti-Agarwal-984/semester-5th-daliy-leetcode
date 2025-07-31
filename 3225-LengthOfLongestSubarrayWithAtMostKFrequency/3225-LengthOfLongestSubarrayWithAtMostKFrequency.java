// Last updated: 7/31/2025, 5:27:40 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int cn=0, ans=0;
        int si=0;
        int i=0;
        for(i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k && si<=i){
                map.put(nums[si], map.get(nums[si])-1);
                si++;
            }
            ans=Math.max(ans, i-si+1);
        }
        return ans;
    }
}