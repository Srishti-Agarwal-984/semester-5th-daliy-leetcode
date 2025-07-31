// Last updated: 7/31/2025, 5:29:18 PM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // Arrays.sort(nums);
        int op = (int)(Math.pow(10,6));
        int[] op1 = new int[op+1];
        for(int i=0; i<nums.length; i++){
            op1[nums[i]]++;
        }
        for(int i=0; i<nums.length; i++){
            int u = nums[i];
            if(u==0 && op1[u]==1 && op1[1]==0){
                ans.add(nums[i]);
            }
            if(u!=0 && u!=op && op1[u]==1 && op1[u-1]==0 && op1[u+1]==0){
                ans.add(u);
            }
            if (u==op && op1[u]==1 && op1[u-1]==0){
                ans.add(u);
            }
        }
        return ans;

        
    }
}