// Last updated: 7/31/2025, 5:29:19 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> as1 = new ArrayList<>();
        List<Integer> as2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                as1.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                as2.add(nums[i]);
            }
        }
        int u= as2.size()+as1.size();
        if(u!=nums.length){
            int a = nums.length-u;
            for(int i=0; i<a; i++){
                as1.add(pivot);
            }
        }
        for(int i=0; i<as1.size(); i++){
            nums[i]=as1.get(i);
        }
        int p= as1.size();
        for(int i=0; i<as2.size(); i++){
            nums[p]=as2.get(i);
            p++;
        }
        return nums;


        
    }
}