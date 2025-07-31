// Last updated: 7/31/2025, 5:26:04 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int y=n;
        int c=0;
        while(y!=0){
            y=y/2;
            c++;
        }
        int op = (int)(Math.pow(2,c));
        
        
        return (int)(op);
        
    }
}