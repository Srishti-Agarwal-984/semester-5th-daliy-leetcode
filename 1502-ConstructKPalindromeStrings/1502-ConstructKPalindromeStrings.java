// Last updated: 7/31/2025, 5:31:10 PM
class Solution {
    public boolean canConstruct(String s, int k) {
        // if(k==s.length()){
        //     return true;
        // }
        if(k>s.length()){
            return false;
        }
         int[] as  = new int[26];
         for(int i=0; i<s.length(); i++){
            as[s.charAt(i)-97]++;
         }
         int c=0;
         for(int i=0; i<26; i++){
            if(as[i]%2!=0){
                c++;
            }
            if(c>k){
                return false;
            }

         }
        //  if(c>k){
        //     return false;
        //  }
         return true;

         

        
    }
}