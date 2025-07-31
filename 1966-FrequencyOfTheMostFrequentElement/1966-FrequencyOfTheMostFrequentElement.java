// Last updated: 7/31/2025, 5:30:03 PM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        long total = 0; // To track the total cost
        int maxFreq = 0;

        for (int right = 0; right < n; right++) {
            total += nums[right];
            
            // Check if the current window is valid
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            // Update the maximum frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
        
    }
    // public static boolean a1(int qw, int[] nums, int k){
    //     long r =0;
    //     for(int j=0; j<qw; j++){
    //         r = r- nums[j];
    //         r = r+ nums[qw];
    //         if(r>k){
    //             return false;
    //         }
    //     }
    //     if(r<=k){
    //         return true;
    //     }
    //     return false;
        

    // }
}