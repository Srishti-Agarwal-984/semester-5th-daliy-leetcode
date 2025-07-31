// Last updated: 7/31/2025, 5:37:20 PM
class Solution {
    //static List<List<Integer>> as = new ArrayList<ArrayList<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> as = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        ans(nums, l1, 0,as);
        return as;


   }
    public static void ans(int[] nums, List<Integer> ll, int i,List<List<Integer>> as){
        // if(new ArrayList<>(ll).size()<=nums.length){
        //     as.add(new ArrayList<>(ll));
        //     return;
        // }
       
        for(int j=i; j<nums.length; j++){
            ll.add(nums[j]);
            ans(nums, ll, j+1,as);
            ll.remove(ll.size()-1);
        }
        if(new ArrayList<>(ll).size()<=nums.length){
            if(as.indexOf(new ArrayList<>(ll))<0){
                as.add(new ArrayList<>(ll));

            }
            
            return;
        }

        // if(i<nums.length){
        //     as.add(ll);
        //     return;
        // }
        
        // for(int j=i; j<nums.length; j++){
        //     ll.add(nums[j]);
        //     ans(nums, ll, i+1);
        // }

    }
}