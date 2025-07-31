// Last updated: 7/31/2025, 5:37:35 PM
class Solution {
    public void sortColors(int[] nums) {
      int[] rt = new int[3];
        for(int i=0; i<nums.length; i++){
            rt[nums[i]]++;
        }
        for(int i=0; i<nums.length; i++){
            if(rt[0]!=0){
                nums[i]=0;
                rt[0]--;
            }
            else if(rt[1]!=0){
                nums[i]=1;
                rt[1]--;
            }
            else{
                nums[i]=2;
            }

        }
    }
}