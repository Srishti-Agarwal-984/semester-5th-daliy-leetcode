// Last updated: 7/31/2025, 5:38:14 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ar = new ArrayList<>();
        List<List<Integer>> ar1 = new ArrayList<>();
        combination(candidates,target,0,ar,ar1);
        return ar1;

        
    }
    public static void combination(int[] candidates, int target,int indx,List<Integer> ar,List<List<Integer>> ar1){
        if(target==0){
            ar1.add(new ArrayList<>(ar)); 
            // if(ar1.indexOf(new ArrayList<>(ar))<0){
            //   ar1.add(new ArrayList<>(ar));  
            // }
            return;
        }
        for(int i=indx; i<candidates.length; i++){
            //if()
            if(target>=candidates[i]){
                if(indx<i && candidates[i]==candidates[i-1]){
                    continue;
                }
                ar.add(candidates[i]);
                combination(candidates,target-candidates[i],i+1,ar,ar1);
                ar.remove(ar.size()-1);
            }
        }
    }
}