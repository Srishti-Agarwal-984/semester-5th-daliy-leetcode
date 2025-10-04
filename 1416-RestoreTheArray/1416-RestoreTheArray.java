// Last updated: 10/4/2025, 11:56:22 PM
class Solution {
    int mod=1000000007;
    String l="";
    public int numberOfArrays(String s, int k) {
        l=String.valueOf(k);
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        int ans=helper(dp,s,k,0);
        return ans;
    }
    public int helper(int[] dp,String s, int k,int i){
        if(i>=s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans=0;
        for(int j=i; j<s.length(); j++){
            if(j-i+1>10){
                continue;
            }
            long k1=Long.parseLong(s.substring(i,j+1));

            if(k1>k){
                break;
            } 
            ans= (ans+helper(dp,s,k,j+1)%mod)%mod;
        }
        return dp[i]=ans;
    }
}