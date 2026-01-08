// Last updated: 1/8/2026, 6:48:24 PM
1class Solution {
2    public int removeBoxes(int[] boxes) {
3        int n = boxes.length;
4        int[][][] dp = new int[n][n][n];
5        for(int[][] arr : dp){
6            for(int[] a : arr){
7                Arrays.fill(a,-1);
8            }
9        }
10        return helper(boxes,0,n-1,0,dp);
11    }
12    public int helper(int[] boxes, int st, int en, int streak, int[][][] dp){
13        if(st > en){
14            return 0;
15        }
16       while(st<en && boxes[st]==boxes[st+1]){
17            streak++;
18            st++;
19       }
20       if(dp[st][en][streak] !=-1){
21            return dp[st][en][streak] ;
22
23       }
24       int max = (streak+1)*(streak+1)+helper(boxes, st+1, en, 0, dp);
25       for(int i=st+1; i<=en; i++){
26        if(boxes[st]==boxes[i]){
27            max = Math.max(max, helper(boxes, st+1, i-1, 0, dp)+helper(boxes, i, en, streak+1, dp));
28        }
29       }
30        return dp[st][en][streak] = max;
31    }
32}