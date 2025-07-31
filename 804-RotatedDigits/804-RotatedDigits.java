// Last updated: 7/31/2025, 5:32:59 PM
class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        int i=1;
        while(i<=n){
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            if(sb.indexOf("3")==-1 && sb.indexOf("4")==-1 && sb.indexOf("7")==-1){
                if(sb.indexOf("2")>=0 || sb.indexOf("5")>=0 || sb.indexOf("6")>=0 || sb.indexOf("9")>=0){
                    c++;
                }
            }
            i++;
        }
        return c;
        
        
    }
}