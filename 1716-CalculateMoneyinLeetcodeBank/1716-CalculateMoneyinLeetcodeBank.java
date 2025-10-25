// Last updated: 10/26/2025, 1:09:13 AM
class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int u = n/7;
        int e = n%7;
        ans= ans+ ((7*8)/2)*u+ ((u-1)*(u)*7)/2+ ((e*(e+1))/2!=0? (e*(e+1))/2+(u*e):0);
        return ans;
    }
}