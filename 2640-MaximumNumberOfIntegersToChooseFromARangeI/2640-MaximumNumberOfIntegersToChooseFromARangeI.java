// Last updated: 7/31/2025, 5:28:19 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] ban = new boolean[n+1];
        for(int i=0; i<banned.length; i++){
            if(banned[i]>n){
                continue;
            }
            ban[banned[i]]=true;
        }
        int sum=0;
        int u=1;
        int c=0;
        while(u<=n){
            if(ban[u]){
                u++;
                continue;
            }
            if(sum+u<=maxSum){
                sum+=u;
                c++;
            }
            else{
                break;
            }
            u++;

        }
        return c;
    }
}