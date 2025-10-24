// Last updated: 10/25/2025, 12:13:51 AM
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for(int[] a:dp){
            Arrays.fill(a, -1000000);
        }
        return helper(dungeon,0,0,dp)+1;
    }
    public int helper(int[][] dungeon, int row , int col, int[][] dp){
        if(row==dungeon.length-1 && col==dungeon[0].length-1){
            return dungeon[row][col]>=0 ? 0:dungeon[row][col]*-1;
        }
        if(row>=dungeon.length || col>=dungeon[0].length){
            return 10001;
        }
        if(dp[row][col]!=-1000000){
            return dp[row][col];
        }

        int a = dungeon[row][col];
        int r = helper(dungeon,row+1,col,dp);
        r=r>=0?r:0;
        int d = helper(dungeon,row,col+1,dp);
        d=d>=0?d:0;
        int itself = Math.max(a-r, a-d)>=0?0:Math.max(a-r, a-d);
        return dp[row][col]=itself*-1;

    }
}