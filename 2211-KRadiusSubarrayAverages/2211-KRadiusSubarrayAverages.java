// Last updated: 7/31/2025, 5:29:32 PM
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        long sum=0;
        System.out.println(nums.length);
        if(k>nums.length){
            k=nums.length;
        }
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
            arr[i]=-1;
        }
        for(int i = nums.length-k; i<nums.length; i++){
            arr[i]=-1;
        }
        if(nums.length<(2*k+1)){
            return arr;
        }
        int c=0, l=2*k+1, j=k;
        for(int i=k; i<nums.length; i++){
            sum=sum+nums[i];
            c++;
            if(c==k+1 && arr[j]==0){
                arr[j]=(int)(sum/l);
                sum=sum-nums[i-l+1];
                c=c-1;
                j++;
            }
        }
        return arr;
        
        
        
        
    }
}