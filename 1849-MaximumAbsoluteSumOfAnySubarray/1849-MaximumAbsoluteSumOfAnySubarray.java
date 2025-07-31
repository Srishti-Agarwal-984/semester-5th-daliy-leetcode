// Last updated: 7/31/2025, 5:30:21 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int max = 0;
        int sum1=0, sum2=0;
        for(int j=0; j<nums.length; j++){
            sum1+=nums[j];
            max=Math.max(sum1,max);
            if(sum1<0){
                sum1=0;
            }
            sum2+=nums[j];
            min=Math.min(sum2,min);
            if(sum2>0){
                sum2=0;
            }
        }


        int p= Math.max(Math.abs(min),max);
        //p=Math.max(p,Math.abs(total));
        return p;


    }
    
}