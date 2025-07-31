// Last updated: 7/31/2025, 5:26:53 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int u = nums.length;
        int f = u-k+1;
        int s =0, m=0;
        int[] arr = new int[f];
        if(u==f){
            for(int i=0; i<nums.length; i++){
                arr[i] = nums[i];
            }
            return arr;
        }
        
        for(int i=0; i<=nums.length-k; i++){
            for(int j=i; j<i+k-1; j++){
                if(nums[j]-nums[j+1]==-1){
                    s=1;
                }
                else{
                    s=0;
                    break;
                }
            }
            if(s==1){
                arr[m]=nums[i+k-1];
            }
            else{
                arr[m]=-1;
            }
            m++;
            s=0;
        }
        return arr;
        
    }
}