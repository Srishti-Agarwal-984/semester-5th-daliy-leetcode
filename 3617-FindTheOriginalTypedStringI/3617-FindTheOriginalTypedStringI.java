// Last updated: 7/31/2025, 5:26:45 PM
class Solution {
    public int possibleStringCount(String word) {
        int ans=0;
        int c=0;
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1)){
                c++;
            }
            else{
                ans+=c;
                c=0;
            }
           
        }
        ans+=c+1;
        
        return ans;
    }
}
 