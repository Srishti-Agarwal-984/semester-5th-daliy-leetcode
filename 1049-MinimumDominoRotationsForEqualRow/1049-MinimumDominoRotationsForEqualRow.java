// Last updated: 7/31/2025, 5:32:17 PM
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
int ans = Integer.MAX_VALUE;
        int c1 = helper(tops, bottoms, 1);
        if(c1!=-1){
            ans = c1;
        }
        int c2 = helper(tops, bottoms, 2);
        if(c2!=-1){
            ans=Math.min(ans, c2);
        }
        int c3 = helper(tops, bottoms, 3);
        if(c3!=-1){
            ans=Math.min(ans, c3);
        }
        int c4 = helper(tops, bottoms, 4);
        if(c4!=-1){
            ans=Math.min(ans, c4);
        }
        int c5 = helper(tops, bottoms, 5);
        if(c5!=-1){
            ans=Math.min(ans, c5);
        }
        int c6 = helper(tops, bottoms, 6);
        if(c6!=-1){
            ans=Math.min(ans, c6);
        }
        if(ans ==Integer.MAX_VALUE ){
            return -1;
        }
        return ans;
        
        



    
        
    }
    public static int helper(int[] tops, int[] bottoms, int r){
        int cn=0;
        for(int i=0; i<tops.length; i++){
            if(tops[i]!=r && bottoms[i]!=r){
                return -1;
            }
            else if(tops[i]!=r && bottoms[i]==r) {
                cn++;

            }
            else{
                continue;
            }
        }
        int bn =0;
        for(int i=0; i<tops.length; i++){
            if(tops[i]!=r && bottoms[i]!=r){
                return -1;
            }
            else if(bottoms[i]!=r && tops[i]==r) {
                bn++;

            }
            else{
                continue;
            }
        }
        return Math.min(bn, cn);


    }
}