// Last updated: 7/31/2025, 5:34:13 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,s=0,c=0;
        while(i!=nums.length){
           if (nums[i]==1){
            c=c+1;
            }
            else{
                c=0;
            }
            if(s<c){
                s=c;
            }
            i=i+1;

        }
        return (s);
        
    }
}