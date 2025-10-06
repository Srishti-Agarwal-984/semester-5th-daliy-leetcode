// Last updated: 10/6/2025, 11:59:41 PM
class Solution { 
    class demo{
        int oc=0;
        int zc=0;
        public  demo(int oc, int zc){
            this.oc=oc;
            this.zc=zc;
        }
    }
    public int findMaxForm(String[] strs, int m, int n) {
        demo[] arr = new demo[strs.length];
        for(int i=0; i<strs.length; i++){
            demo p=new demo(0,0);
            int c=0;
            int si=0;
            while(si<strs[i].length()){
                if(strs[i].charAt(si)=='0'){
                    c++;
                }
                si++;
            }
            p.oc=strs[i].length()-c;
            p.zc=c;
            arr[i]=p;
        }
        int[][][] dp = new int[arr.length][m+1][n+1];
        for(int[][] ar: dp){
            for(int[] aq: ar){
                Arrays.fill(aq,-1);
            }
        }
        int ans=helper(arr,m,n,0,dp);

        return ans;  
    }
    public int  helper(demo[] arr, int m, int n, int i, int[][][] dp){
        if(m==0 && n==0){
            return 0;
        }
        if(i>=arr.length){
            return 0;
        }
        if(dp[i][m][n]!=-1){
            return dp[i][m][n];
        }
        int ans=0;
        int inc=0, exc=0;
        if(m>=arr[i].zc && n>=arr[i].oc){
            inc=1+helper(arr,m-arr[i].zc,n-arr[i].oc,i+1,dp);
        }
        exc=helper(arr,m,n,i+1,dp);
        dp[i][m][n]=Math.max(exc, inc);
        return dp[i][m][n];
    }
   
}