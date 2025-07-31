// Last updated: 7/31/2025, 5:37:32 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ar = new ArrayList<>();
        List<List<Integer>> ar1 = new ArrayList<>();
        combination(n,k,1,ar,ar1);
        return ar1;

        
    }
    public static void combination(int n, int k,int indx,List<Integer> ar,List<List<Integer>> ar1){
        if(k==0){
            ar1.add(new ArrayList<>(ar));
            return;
        }
        for(int i=indx; i<n-k+2; i++){
            if(k>0){
                ar.add(i);
                combination(n,k-1,i+1,ar,ar1);
                ar.remove(ar.size()-1);
            }
        }
    }
}