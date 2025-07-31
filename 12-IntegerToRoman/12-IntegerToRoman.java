// Last updated: 7/31/2025, 5:38:43 PM
class Solution {
    public String intToRoman(int num) {
        String s = "";
        int c=0;
        String [] sd = {"I", "X", "C","M"};
        String [] sd1 = {"V", "L", "D"};
        while(num!=0){
            String h="";
            int o= num%10;
            int g= (int)(Math.pow(10,c));
            if(o<=3){
                while(o>0){
                    h=h+sd[c];
                    o--;
                }
            }
            if(o==4){
                h+=sd[c]+sd1[c];

            }
            if(o>=5 && o<=8){
                h+=sd1[c];
                while(o>5){
                    h+=sd[c];
                    o--;
                }
            }
            if(o==9){
                h+=sd[c]+sd[c+1];
            }
            c++;
            num/=10;
            s=h+s;
        }
        return s;
        
    }
}