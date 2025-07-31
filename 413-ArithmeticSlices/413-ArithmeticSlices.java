// Last updated: 7/31/2025, 5:34:38 PM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int[] arr = new int[nums.length-1];
        int[] su= new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            arr[i]=nums[i+1]-nums[i];
            
            
        }
        su[0]=0;
        for(int i=1; i<nums.length; i++){
            su[i]+=su[i-1]+i;
        }
            
        
        
        int l=0, n=arr.length-1;
        int sum=0;
        int c=0;
            
        while(l<n){
            if(arr[l]==arr[l+1]){
                c++;
            }
            else{
                if(c!=0){
                    sum+=su[c];
                }
                c=0;
                
            }
            l++;
            
        }
        if(c!=0){
            sum+=su[c];
        }
        return sum;
        
        
        
    }
}