// Last updated: 7/31/2025, 5:26:50 PM
class Solution {
    public int countOfSubstrings(String word, int k) {
        int ans = 0;
        for (int j = 0; j < word.length(); j++) {
            int ca=0,ce=0,ci=0,cu=0,co=0;
            int c=0;
            for (int i = j; i < word.length(); i++){
                if(word.charAt(i)=='a'){
                    ca++;
                }
                else if(word.charAt(i)=='e'){
                    ce++;
                }
                else if(word.charAt(i)=='i'){
                    ci++;
                }
                else if(word.charAt(i)=='o'){
                    co++;
                }
                else if(word.charAt(i)=='u'){
                    cu++;
                }else{
                    c++;
                }
                if(ca>=1 && ce>=1 && co>=1 && ci>=1 && cu>=1 && c==k){
                    ans++;
                }
                if(c>k){
                    break;
                }
            }
        }
        
        return ans;
    }
}