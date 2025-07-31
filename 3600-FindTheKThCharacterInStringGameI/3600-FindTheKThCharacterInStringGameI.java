// Last updated: 7/31/2025, 5:26:47 PM
class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(s.length()<k){
            StringBuilder df = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='z'){
                    df.append("a");
                }
                else{
                    df.append(""+(char)(s.charAt(i)+1));
                }

            }
            s = s+df.toString();

        }
        return s.charAt(k-1);
    }
}