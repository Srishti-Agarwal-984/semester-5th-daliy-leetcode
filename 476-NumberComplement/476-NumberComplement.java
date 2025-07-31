// Last updated: 7/31/2025, 5:34:18 PM
class Solution {
    public int findComplement(int num) {
        int g = 0;
        int c=0;
        String as = new String();
        while(num!=0){
            if(num%2==0){
                as=as+"1";
            }
            else{
                as=as+"0";
            }
            num=num/2;
            c++;
            
        }
        int i=0;
        while(c!=0){
            int b = (int)(as.charAt(c-1))-48;
            
            g=g+(b*(int)(Math.pow(2,(c-1))));
            c--;
        }
        return g;
        // int gp = (int)(Math.pow(2,c))-1;
        // int y=0;
        // while(gp!=0){
        //     if((gp&g)==0){
        //         y=gp;
        //         break;
        //     }
        //     gp--;
        // }
        // return y;
        
    }
}