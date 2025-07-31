// Last updated: 7/31/2025, 5:34:31 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        // int [] ar1 = new int[nums[nums.length-1]+1];
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                ll.add(nums[i]);
            }
        }
        // ArrayList<Integer> ll = new ArrayList<>();
        // for(int i=0; i<ar1.length; i++){
        //     if(ar1[i]>=2){
        //         ll.add(i);
        //     }
        // }
        return ll;
        
    }
}