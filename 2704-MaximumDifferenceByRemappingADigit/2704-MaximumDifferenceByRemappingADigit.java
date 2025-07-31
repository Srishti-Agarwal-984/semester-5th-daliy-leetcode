// Last updated: 7/31/2025, 5:28:07 PM
class Solution {
    public int minMaxDifference(int num) {
        int qw = num;
        int nm = num;
        int p=-1, u=-1;

        while(qw!=0){
            if(qw%10!=9){
                u=qw%10;
            }
            p=qw%10;
            qw/=10;
        }
        int nm1 =0;
        if(u==-1){
            nm1= nm;
        }
        else{
            qw=nm;
            int c=0;

            while(qw!=0){
                if(qw%10==u){
                    nm1=(int)(nm1+Math.pow(10,c)*9);
                }
                else{
                    nm1=(int)(nm1+Math.pow(10,c)*(qw%10));

                }
                qw/=10;
                c++;
            }

        }
        qw=num;
        nm=0;
        int c=0;
        while(qw!=0){
            if(qw%10==p){
                nm=(int)(nm+Math.pow(10,c)*0);
            }
            else{
                nm=(int)(nm+Math.pow(10,c)*(qw%10));

            }
            qw/=10;
            c++;
        }
            
        
        int r = nm1-nm;
        return r;
    }
}