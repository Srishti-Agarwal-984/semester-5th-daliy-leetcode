// Last updated: 7/31/2025, 5:33:51 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int  n=nums.length;
        int sum = 0;
        int[] su = new int[nums.length];
        for(int i=0; i<n; i++){
            sum+=nums[i];
            su[i]=sum;
        }
        for(int i=0; i<n; i++){
            if(su[i]==k){
                count++;
            }
            for(int j=i+1; j<n; j++){
                if(su[j]-su[i]==k){
                    count++;
                }
            }
        }
        return count;

    
        
    }
}