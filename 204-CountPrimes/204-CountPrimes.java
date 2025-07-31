// Last updated: 7/31/2025, 5:35:56 PM
class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int[] ans= new int[n];
        ans[0]=ans[1]=1;
        for(int i=2; i*i<=ans.length; i++){
            if(ans[i]==0){
                for(int j=2; i*j<n; j++){
                    ans[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=1; i<ans.length; i++){
            if(ans[i]==0){
                //System.out.println(ans[i]);
                c++;
            }
        }
        return c;
        
    }
}