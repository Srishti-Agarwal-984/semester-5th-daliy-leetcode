// Last updated: 7/31/2025, 5:34:01 PM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]%k;
        }
        HashMap<Integer, Integer> fg = new HashMap<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum=(sum+nums[i])%k;
            if(fg.containsKey(sum)){
                int r =i- fg.get(sum);
                if(r>=2){
                    return true;
                }
            }
            else{
                fg.put(sum, i);
            }
            if(sum%k==0 && i>=1){
                return true;
            }
        }
        if(sum%k==0 && nums.length>=2){
            return true;

        }
        return false;
    }
}