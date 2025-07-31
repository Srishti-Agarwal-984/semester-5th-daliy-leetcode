// Last updated: 7/31/2025, 5:35:45 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> as = new  ArrayList<Integer>();
        int g = nums.length/3;
        Arrays.sort(nums);
        int y=1;
        int i=0;
        for(i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                y++;
            }
            else{
                if(y>g){
                    as.add(nums[i]);
                }
                y=1;
            }
        }
        if(y>g){
            as.add(nums[i]);
        }
       
        return as;

        
    }
    
}