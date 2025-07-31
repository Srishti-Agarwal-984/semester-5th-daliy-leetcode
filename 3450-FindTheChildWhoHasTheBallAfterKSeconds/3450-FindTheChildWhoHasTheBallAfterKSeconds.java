// Last updated: 7/31/2025, 5:27:18 PM
class Solution {
    public int numberOfChild(int n, int k) {
        int y;
        int h;
        if(n!=1 && k!=n-1 && n-1!=1){

            y=k/(n-1);
            h=k%(n-1);
            if(y%2==0){
                return 0+h; 
            }
            return n-1-h; 
        }
        if(n-1==1){
            if(k%2==0){
                return 0;
            }
            else{
                return 1;
            }
        }
        if(k==n-1){
            return n-1;
        }
        return 0;   
    }
}