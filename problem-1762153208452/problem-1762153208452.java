// Last updated: 11/3/2025, 12:30:08 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int r = nums[0];
        int e = nums[nums.length-1];
        int q  = nums.length;
        List<Integer> li = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]!=r){
                li.add(r);
            }
            if(nums[i]==r){
                i++;
            }
            r++;
        }
        
        return li;
        
        
    }
}