// Last updated: 7/31/2025, 5:26:19 PM
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] pre = new int[n+1];
        pre[0] = startTime[0]-0;
        for(int i = 1; i<n; i++){
            pre[i] = startTime[i]-endTime[i-1];
        }
        pre[n] = eventTime-endTime[n-1];
        int st = 0;
        int end = 0;
        int ans = 0;
        int sum = 0;
        int c = 0;
        while(end <= n){
            sum+=pre[end];
            while(st <= end && c > k){
                sum-=pre[st];
                st++;
                c--;
            }
            c++;
            ans = Math.max(ans,sum);
            end++;
        }
        return ans;
    }
}