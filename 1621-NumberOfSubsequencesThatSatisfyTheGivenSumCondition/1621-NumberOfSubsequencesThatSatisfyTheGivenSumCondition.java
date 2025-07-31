// Last updated: 7/31/2025, 5:30:46 PM
class Solution {
    public int numSubseq(int[] nums, int target) {
         Arrays.sort(nums);
        int si=0, en=nums.length-1;
        long ans=0;
        int n = nums.length;

        // Precompute powers of 2 up to n
        int[] pow2 = new int[n];
        int mod = 1000000007;
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        
        while(si<=en){
            long kl = nums[si]+nums[en];
            if(nums[si]+nums[en]>target){
                en--;
            }
            else {
                ans=(ans+pow2[en-si])%mod;
                si++;
            }
        }
        return (int)(ans%mod);
    }
}