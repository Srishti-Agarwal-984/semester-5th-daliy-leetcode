// Last updated: 10/10/2025, 5:32:24 PM
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        long[] dp = new long[stoneValue.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        long a = helper(stoneValue, 0,dp);
        if(a>0){
            return "Alice";
        }
        return a==0? "Tie":"Bob";

    }
    public long helper(int[] stoneValue, int i,long[] dp ){
        if(i>=stoneValue.length){
            return 0;
        }
        if(dp[i]!=Integer.MIN_VALUE){
            return dp[i];
        }
        long a =stoneValue[i]-helper(stoneValue, i+1,dp);
        long b = Integer.MIN_VALUE;
        long c = Integer.MIN_VALUE;
        if(stoneValue.length-i>=2){
            b= stoneValue[i]+stoneValue[i+1]-helper(stoneValue, i+2,dp);
        }
        if(stoneValue.length-i>=3){
            c= stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-helper(stoneValue, i+3,dp);
        }
        return dp[i]=Math.max(a,Math.max(b,c));
        

    }
}