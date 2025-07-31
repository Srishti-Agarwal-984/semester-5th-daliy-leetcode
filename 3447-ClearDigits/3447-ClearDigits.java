// Last updated: 7/31/2025, 5:27:19 PM
class Solution {
    public String clearDigits(String s) {
        int c =0;
        String a="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                if(a.length()>=1){
                    a=a.substring(0,a.length()-1);
                }
                // a=a.substring(0,a.length()-1);
            }
            else{
                a=a+s.charAt(i);
            }
        }
        return a;
        
    }
}