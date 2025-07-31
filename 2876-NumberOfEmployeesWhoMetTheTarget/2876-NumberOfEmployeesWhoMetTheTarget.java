// Last updated: 7/31/2025, 5:27:56 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0, i=0;
        while(i<hours.length){
            if(hours[i]>=target){
                c=c+1;
            }
            i=i+1;
        }
        return c;
        
    }
}