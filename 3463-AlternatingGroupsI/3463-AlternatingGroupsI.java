// Last updated: 7/31/2025, 5:27:11 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int a=0, l,m,n;
        int y=colors.length-1;
        for(int i=0; i<=y ; i=i+1){
            if(i!=y-1 && i!=y){
                l = colors[i];
                m = colors[i+1];
                n = colors[i+2];
                if(l!=m  && m!=n){
                    a=a+1;
                }
            }
            else if(i==y-1){
                l = colors[i];
                m = colors[i+1];
                n=colors[0];
                if(l!=m  && m!=n){
                    a=a+1;
                } 
            }
            else{
                l = colors[i];
                m = colors[0];
                n=colors[1];
                if(l!=m  && m!=n){
                    a=a+1;
                }   
            }
        }
        return a;
    }
}