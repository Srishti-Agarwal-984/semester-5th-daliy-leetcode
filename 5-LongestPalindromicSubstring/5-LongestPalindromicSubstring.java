// Last updated: 7/31/2025, 5:38:50 PM
class Solution {
    public String longestPalindrome(String s) {
        int y=1;
        String d = ""+ s.charAt(0);
        int n = s.length();
        for(int i=0; i<s.length(); i++){
            int p=i+1, k=i-1;
            String g = ""+s.charAt(i);
            int c=1;
            while(p<n && k>=0){
                if(s.charAt(p)==s.charAt(k)){
                    g=""+s.charAt(k)+g+s.charAt(p);
                    p++;
                    k--;
                    c=c+2;
                }
                else{
                    break;
                }
            }
            if(c>y){
                y=c;
                d=g;
            }
        }
        for(double i=0.5; i<s.length(); i++){
            double p=i+0.5, k=i-0.5;
            String g = "";
            int c=1;
            while(p<n && k>=0.0){
                if(s.charAt((int)p)==s.charAt((int)k)){
                    g=""+s.charAt((int)k)+g+s.charAt((int)p);
                    p=p+1.0;
                    k=k-1.0;
                    c=c+2;
                }
                else{
                    break;
                }
            }
            if(c>y){
                y=c;
                d=g;
            }
        }
        return d;

        
    }
}