// Last updated: 7/31/2025, 5:26:08 PM
class Solution {
    public String smallestPalindrome(String s) {
        String[] freq = new String[26];
        for (int i = 0; i < 26; i++) {
            if(freq[i]==null){
                freq[i]="";
            }
        }
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']+=s.charAt(i);
        }
        String front = "";
        String back = "";
        String center = "";
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if(freq[i]!=null){
                
            
                    int y = freq[i].length();
                    if (y % 2 == 0 && y > 0) {
                        y=y/2;
                        front += freq[i].substring(0,y);
                        back = freq[i].substring(y) + back;
                        y=0;
                    }
                    if (y % 2 != 0 && y>0) {
                        y=y/2;
                        front += freq[i].substring(0,y);
                        back = freq[i].substring(y+1) + back;
                        if(c==0){
                            center+=(char)(i+97);
                            c=1;
                        }
                        y=0;
                    }
            }
        }
        return front+center+back;

    }
}