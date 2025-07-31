// Last updated: 7/31/2025, 5:32:05 PM
class Solution {
    public boolean isRobotBounded(String inst) {
        int x=0,y=0;
        int t=0;
        char[] d = new char[4];
        d[0]='n';
        d[1]='e';

        d[2]='s';
        d[3]='w';
        for(int i=0; i<inst.length(); i++){
            if(inst.charAt(i)=='L'){
                t=(4-1+t)%4;
            }
            else if(inst.charAt(i)=='R'){
                t=(t+1)%4;
            }
            else{
                if(d[t]=='n'){
                    y++;
                }
                else if(d[t]=='s'){
                    y--;
                }
                else if(d[t]=='e'){
                    x++;
                }
                else {
                    x--;
                }
            }

        }
        if(d[t]!='n' || (x==0 && y==0)){
            return true;
        }
        return false;
        
    }
}