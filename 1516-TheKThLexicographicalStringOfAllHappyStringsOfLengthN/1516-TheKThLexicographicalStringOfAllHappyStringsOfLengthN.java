// Last updated: 7/31/2025, 5:31:04 PM
class Solution {
    static char[] as ={'a','b','c'};
    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        comb(n,ans,"");
        if(ans.size()<k){
            return "";

        }
        return ans.get(k-1);






    }
    public static void comb(int n, List<String> ans, String hs){
        if(n==0){
            ans.add(hs);
            return;
        }
        for(int i=0; i<as.length; i++){
            if(hs.length()==0){
                comb(n-1,ans,hs+as[i]);
            }
            else{
                if(hs.charAt(hs.length()-1)!=as[i]){
                    comb(n-1,ans,hs+as[i]);
                }
            }
        }
    }
}