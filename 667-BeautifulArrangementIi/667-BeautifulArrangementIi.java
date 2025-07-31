// Last updated: 7/31/2025, 5:33:26 PM
class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        ans[0]=1;
        for(int i=0; i<n; i++){
            ans[i]=i+1;
        }
        if(k==1){
            return ans;
        }
        int i=1;
        while(k>1){
            helper(i,ans);
            i++;
            k--;
        }
        return ans;


    }
    public void helper(int idx, int[] ans){
        int si=idx, en=ans.length-1;
        while(si<=en){
            int temp=ans[si];
            ans[si]=ans[en];
            ans[en]=temp;
            si++;
            en--;
        }

    }
}