// Last updated: 7/31/2025, 5:38:15 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();

        combination(candidates, target, 0, ar, ans);
        return ans;

        
    }
    public static void combination(int[] candidates, int target, int indx, List<Integer> ar, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ar));
            return;
        }
        for(int i=indx; i<candidates.length; i++){
            if(candidates[i]<=target){
                //ar.add(candidates[i]);
                ar.add(candidates[i]);
                combination(candidates, target-candidates[i], i, ar, ans);
                ar.remove(ar.size()-1);
            }
            //ar.remove(ar.size()-1);
        }
    }
}