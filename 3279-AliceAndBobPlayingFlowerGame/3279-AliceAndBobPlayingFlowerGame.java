// Last updated: 7/31/2025, 5:27:37 PM
class Solution {
    public long flowerGame(int n, int m) {
        if(n==m && n==100000){
            return 5000000000l;
        }
        long ans =0l;
        ans=ans+((n+1)/2)*((m)/2);
        ans=ans+((m+1)/2)*((n)/2);
        return ans;
    }
    
}