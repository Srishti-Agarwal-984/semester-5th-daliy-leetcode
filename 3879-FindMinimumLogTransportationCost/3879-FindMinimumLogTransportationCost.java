// Last updated: 7/31/2025, 5:25:47 PM
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k){
            return 0;
        }
        if(n>k && m>k){
            return 0;
        }
        long ans = 0;
        while(n>k){
            ans += (long)k*(n-k);
            n-=k;
        }
        while(m>k){
            ans+=(long)k*(m-k);
            m-=k;
        }
        return ans;

    }
}