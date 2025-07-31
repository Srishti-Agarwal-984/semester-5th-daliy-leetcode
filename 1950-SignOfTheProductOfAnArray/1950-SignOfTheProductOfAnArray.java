// Last updated: 7/31/2025, 5:30:07 PM
class Solution {
    public int arraySign(int[] nums) {
        double p=1.0;
        int g=0;
        for(int i=0; i<nums.length; i=i+1)
        {
            p=p*nums[i];
        }
        if(p>0){
            g=1;
        }
        if(p<0){
            g=-1;
        }
        if(p==0){
            g=0;
        }
        return g;

    }
}