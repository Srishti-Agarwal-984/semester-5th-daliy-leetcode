// Last updated: 7/31/2025, 5:35:48 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int u = map.getOrDefault(nums[i], -1);
            if(u!=-1 && i-u<=k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}