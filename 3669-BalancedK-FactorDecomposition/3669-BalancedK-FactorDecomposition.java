// Last updated: 9/5/2025, 6:45:33 AM
class Solution {
    int ans=Integer.MAX_VALUE;
    List<Integer> df = new ArrayList<>();
    public int[] minDifference(int n, int k) {
        List<Integer> as = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                as.add(i);
            }
        }
        Collections.sort(as);
        List<Integer> a = new ArrayList<>();
        helper(n,as,a,k,0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i]=df.get(i);
        }
        return arr;
    }
    public void helper(int n, List<Integer> as, List<Integer> a, int k, int i, int min, int max){
        if(n==1 && k==0){
            if(ans> (max-min)){
                df=new ArrayList<>(a);
                ans=max-min;
            }
            return;
        }
        if(k<0 || n==1){
            return;

        }
        for(int si=i; si<as.size(); si++){
            if(n%as.get(si)==0){
                a.add(as.get(si));
                // min=Math.min(min, si);
                // max=Math.max(max, si);
                helper(n/as.get(si),as,a,k-1,si,Math.min(min, as.get(si)),Math.max(max, as.get(si)));
                a.remove(a.size()-1);
            }
        }
    }
}