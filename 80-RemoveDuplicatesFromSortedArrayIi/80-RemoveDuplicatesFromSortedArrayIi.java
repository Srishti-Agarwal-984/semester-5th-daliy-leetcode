// Last updated: 7/31/2025, 5:37:28 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] nu= new int[nums.length];
        int c=1;
        int u=1;
        int p=1;
        nu[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                c++;
                if(c<=2){
                    nu[u]=nums[i];
                    p++;
                    u++;
                }
            }
            else{
                c=1;
                nu[u]=nums[i];
                p++;
                u++;
            }  
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=nu[i];
        }
        return p;
        
    }
}