// Last updated: 7/31/2025, 5:33:01 PM
class Solution {
    public int numRabbits(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==nums[i]+1){
                ans+=nums[i]+1;
                map.remove(nums[i]);
            }
        }
        for (Integer key : map.keySet()) {
            ans+=key+1;
        }

        return ans;
    }
}