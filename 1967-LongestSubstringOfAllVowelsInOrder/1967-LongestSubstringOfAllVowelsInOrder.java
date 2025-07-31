// Last updated: 7/31/2025, 5:30:01 PM
class Solution {
    public int longestBeautifulSubstring(String word) {
        int cn=0, i=0, ans=0;
        int j=0;
        char[] df = {'a','e','i','o','u'};
        while(i<word.length()){
            if(cn==0 && word.charAt(i)==df[j]){
                cn++;
            }
            else if(cn!=0 && word.charAt(i)==df[j]){
                cn++;
                if(j==4){
                    ans=Math.max(ans,cn);
                }
            }
            else if(j!=df.length-1 && cn!=0 && word.charAt(i)==df[j+1]){
                cn++;
                j++;
            }
            else{
                cn=0;
                j=0;
                if(word.charAt(i)=='a'){
                    cn=1;
                }
            }
            if(j==4){
                ans=Math.max(ans,cn);
            }
            i++;


        }
        if(j==4){
            ans=Math.max(ans,cn);
        }
        return ans;
        
    }
}