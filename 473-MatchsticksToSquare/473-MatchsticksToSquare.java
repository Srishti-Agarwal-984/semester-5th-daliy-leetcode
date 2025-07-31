// Last updated: 7/31/2025, 5:34:20 PM
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum =0;
        for(int i=0; i<matchsticks.length; i++){
            sum+=matchsticks[i];
        }
        if(sum%4!=0){
            return false;
        }
        Arrays.sort(matchsticks);
        int y = sum/4;
        if(matchsticks[matchsticks.length-1]>y){
            return false;
        }
        boolean gh = ans(matchsticks, 0, 0, 0, 0,matchsticks.length-1,y);
        return gh ;
        
    }
    public  boolean ans(int[]matchsticks, int a, int b, int c, int d, int i, int y){
        if(a==b && b==c && c==d && d==y){
            return true;
        }
        if( a>y || b>y || c>y|| d>y){
            return false;
        }
        int p  = matchsticks[i];
        boolean q1 = ans(matchsticks, a+p, b, c, d,i-1,y);
        if(q1){
            return true;
        }
        boolean q2 = ans(matchsticks, a, b+p, c, d,i-1,y);
        if(q2){
            return true;
        }
        boolean q3 = ans(matchsticks, a, b, c+p, d,i-1,y);
        if(q3){
            return true;
        }
        boolean q4 = ans(matchsticks, a, b, c, d+p,i-1,y);
        if(q4){
            return true;
        }
        
        return false;


    }
}