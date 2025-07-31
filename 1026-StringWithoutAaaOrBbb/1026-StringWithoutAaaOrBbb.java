// Last updated: 7/31/2025, 5:32:21 PM
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        if(a<b){
            while(a!=b && b>=2 && a>0){
                sb.append("bba");
                b=b-2;
                a=a-1;
            }
        }
        if(a>b){
            while(a!=b  && a>=2 && b>0){
                sb.append("aab");
                b=b-1;
                a=a-2;
            }
        }
        if(a==0 && b!=0){
            for(int i=0; i<b; i++){
                sb.append("b");

            }
            b=0;
        }
        if(a!=0 && b==0){
            for(int i=0; i<a; i++){
                sb.append("a");

            }
            a=0;
        }
        
        for(int i=0; i<b; i++){
            sb.append("ab");

        }
        return sb.toString();

    }
}