// Last updated: 10/8/2025, 9:00:51 PM
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr  =  preorder.split(",");
        int diff=1;
        for(String s: arr){
            if(--diff<0){
                return false;
            }
            if(!s.equals("#")){
                diff+=2;
            }
        }
        return diff==0;
     
    }
}