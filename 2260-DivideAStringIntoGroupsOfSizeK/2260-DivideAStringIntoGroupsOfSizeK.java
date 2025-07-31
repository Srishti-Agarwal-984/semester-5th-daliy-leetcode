// Last updated: 7/31/2025, 5:29:20 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String u="";
        if(s.length()%k!=0){
            for(int i=0; i<(k-s.length()%k); i++){
                u+=fill;
            }
        }
        s=s+u;
        int p=s.length()/k;
        String[] ans= new String[p];
        for(int i=0; i<=s.length()-k; i+=k){
            ans[i/k]=s.substring(i, i+k);
        }
        return ans;
    }
}