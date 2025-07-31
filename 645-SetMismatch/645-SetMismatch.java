// Last updated: 7/31/2025, 5:33:31 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] p = new int[2];
        int[] p1 = new int[nums.length+1];
        long f =(nums.length*(nums.length+1))/2;
        for(int i=0; i<nums.length; i++){
            p1[nums[i]]++;
            if(p1[nums[i]]==2){
                p[0]=nums[i];
            }
            if(p1[nums[i]]==1){
                f=f-nums[i];
            }
        }
        p[1]=(int)f;
        return p;

        
    }
}