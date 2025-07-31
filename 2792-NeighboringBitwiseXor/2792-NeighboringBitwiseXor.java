// Last updated: 7/31/2025, 5:28:00 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        // int[] arr = new int[derived.length];
        // if(derived.length==1){
        //     if(derived[0]==1){
        //         return false;
        //     }
        //     return true;
        // }
        int a=0;
        for(int i=0; i<derived.length; i++){
            a=a^derived[i];
        }
        if(a==0){
            return true;
        }
        
        return false;
        
    }
}