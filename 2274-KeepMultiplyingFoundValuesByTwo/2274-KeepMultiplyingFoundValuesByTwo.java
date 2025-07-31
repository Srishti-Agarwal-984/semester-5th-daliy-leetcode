// Last updated: 7/31/2025, 5:29:16 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(isTrue(nums, original)){
            original = 2 * original;
        }
        return original;

        // Arrays.sort(nums);
        // for(int n : nums){
        //     if(n == original){
        //         original = 2 * original;
        //     }
        // }
        // return original;
    }
    private boolean isTrue(int[] arr, int target){
        for(int n : arr){
            if(n == target) return true;
        }
        return false;
    }
}