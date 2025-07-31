// Last updated: 7/31/2025, 5:29:34 PM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] s = Arrays.copyOf(nums, n);
        int[] ans1 = new int[k];
        int c=0;

        Arrays.sort(s);
        for(int i=0; i<nums.length; i++){
            for(int i1=n-k; i1<n; i1++){
                if(nums[i]==s[i1]){
                    ans1[c]=nums[i];
                    s[i1]=Integer.MIN_VALUE;
                    c++;
                    break;
                }
            }
            if(c==k){
                break;
            }

        }
        return ans1;
        
    }
}