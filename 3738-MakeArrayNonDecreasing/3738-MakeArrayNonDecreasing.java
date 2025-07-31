// Last updated: 7/31/2025, 5:26:21 PM
class Solution {
    public int maximumPossibleSize(int[] nums) {
        List<Integer> ar = new ArrayList<>();
        ar.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            int n = ar.size()-1;
            if(ar.get(n)<=nums[i]){
                ar.add(nums[i]);
            }
        }
        return ar.size();
        
    }
}