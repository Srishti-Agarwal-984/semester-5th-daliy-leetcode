// Last updated: 7/31/2025, 5:38:47 PM
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int i=0, sign=1;
        if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
            sign  =  s.charAt(i)=='-'?-1:1;
            i++;
        }
        long num=0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }

            
            num=num*10+(s.charAt(i)-'0');
            if(num*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;

        }
        return(int) (sign*num);

        
    }
}