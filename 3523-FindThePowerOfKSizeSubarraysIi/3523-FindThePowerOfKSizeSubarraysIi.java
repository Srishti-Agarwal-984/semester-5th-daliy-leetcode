// Last updated: 7/31/2025, 5:26:51 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length+1-k];
        int d=0;
        int a = nums.length - k + 1;
        if (k == 1) {

            return nums;
        }
        int yu=-1;
        int la=-1;

        for (int i = 0; i <k-1; i++) {
            if(nums[i]-nums[i+1]!=-1){
                la=i;
                ans[d]=-1;
            }
        }
        if(la==-1){
            ans[d]=nums[k-1];
        }
        d++;
        for(int i=k-1; i<nums.length-1; i++){
            if(nums[i]-nums[i+1]!=-1){
                la=i;
                ans[d]=-1;
                d++;
                //System.out.println(la);
            }
            else if(la>i-k+1){
                ans[d]=-1;
                d++;
                //System.out.println(la);
            }
            else{
                ans[d]= nums[i+1];
                //System.out.println(ans[d]);
                d++;
            }
        }
        return ans;

    }
}