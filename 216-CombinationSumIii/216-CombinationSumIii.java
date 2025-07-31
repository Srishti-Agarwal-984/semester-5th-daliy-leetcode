// Last updated: 7/31/2025, 5:35:51 PM
class Solution {
    //static List<List<Integer>> ar1 = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ar1 = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();
        combinations(k, n,1,ar,ar1);
        return ar1;    
    }
    public static void combinations(int k, int n, int indx,List<Integer> ar,List<List<Integer>> ar1){
        if(k==0 && n==0){
            ar1.add(new ArrayList<>(ar));
            return;
        }
        if(k==0 || n==0){
            return;
        }
        for(int i=indx; i<10; i++){
            if(n>=i){
                ar.add(i);
                combinations(k-1, n-i,i+1,ar,ar1);
                ar.remove(ar.size()-1);
            }
        }
    }
}