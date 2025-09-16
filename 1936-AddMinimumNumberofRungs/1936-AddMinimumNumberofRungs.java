// Last updated: 9/17/2025, 12:11:55 AM
class Solution {
    public int addRungs(int[] rungs, int dist) {
        int c=0, prev=0;
        for(int i=0; i<rungs.length; i++){
            int diff= rungs[i]-prev;
            if(diff>dist){
                diff=diff-1;
                c+=diff/dist;
            }
            prev=rungs[i];
           
        }
        return c;
    }
}