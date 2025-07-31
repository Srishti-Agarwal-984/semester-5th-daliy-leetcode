// Last updated: 7/31/2025, 5:34:08 PM
class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int p=0;
        if(num<0){
            p=1;
            num=num*-1;
        }
        while(num!=0){
            sb.append(num%7);
            num=num/7;
        }
        
        if(p==1){
            sb.append("-");
        }
        sb.reverse();

        
        String s= sb.toString();
        
        return s;
        
    }
}