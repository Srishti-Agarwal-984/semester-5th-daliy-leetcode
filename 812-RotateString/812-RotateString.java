// Last updated: 7/31/2025, 5:32:56 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        if(s.indexOf(goal)>=0){
            return true;
        }
        return false;
    }
}