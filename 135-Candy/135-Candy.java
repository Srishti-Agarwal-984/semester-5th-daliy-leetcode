// Last updated: 7/31/2025, 5:36:40 PM
class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int idx =1;
        int ans=1;
        while(idx<n){
            if(r[idx]==r[idx-1]){
                ans++;
                idx++;
                continue;
            }
            int up=1;
            while(idx<n && r[idx]>r[idx-1]){
                up++;
                ans=ans+up;
                
                idx++;
            }
            int down=1;
            while(idx<n && r[idx]<r[idx-1]){
                
                ans=ans+down;
                down++;
                idx++;
            }
            if(down>up){
                ans= ans + down - up;
            }

        }
        return ans;

        
    }
}