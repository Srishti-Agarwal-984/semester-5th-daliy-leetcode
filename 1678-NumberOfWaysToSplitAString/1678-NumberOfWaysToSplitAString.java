// Last updated: 7/31/2025, 5:30:37 PM
class Solution {
    public int numWays(String s) {
        int cn=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                cn++;
            }
        }
        if(cn%3!=0){
            return 0;
        }
        cn=cn/3;
        int mod = 1000000007;
        if(cn==0){
            int g = s.length()-2;
            int l = s.length()-1;
            long ans = 0;
            while(g>=0){
                ans=(ans+g)%mod;
                g--;
            }
            return (int)(ans);
        }
        long ans=1;
        int c=0;
        int i=0;
        int u=0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i)=='1' && c!=cn){
                c++;
            }
            else if(c==cn && s.charAt(i)=='1'){
                break;
            }
            else if(c==cn && s.charAt(i)=='0'){
                u++;
            }
            else{
                continue;
            }

        }
        int d=0;
        c=0;
        for(; i<s.length(); i++){
            if(s.charAt(i)=='1' && c!=cn){
                c++;
            }
            else if(c==cn && s.charAt(i)=='1'){
                break;
            }
            else if(c==cn && s.charAt(i)=='0'){
                d++;
            }
            else{
                continue;
            }
        }
        if(u!=0){
            ans=(ans*(u+1))%mod;
        }
        if(d!=0){
            ans=(ans*(d+1))%mod;
            // long kl = ans;
            // ans =0;
            // for(int i1=0; i1<=d; i1++){
            //     ans=(ans+kl)%mod;

            // }
        }
        return (int) ans;


    }
}