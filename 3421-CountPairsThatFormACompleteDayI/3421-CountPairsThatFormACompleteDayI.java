// Last updated: 7/31/2025, 5:27:22 PM
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int i=0, c=0,j=1,m;
        while(i<hours.length-1){
            if(j<hours.length){
                m=hours[i]+hours[j];
                if(m%24==0){
                    c=c+1;
                }
                j=j+1;
            }
            else{
                i=i+1;
                j=i+1;
            }
        }
        return c;
    }
}