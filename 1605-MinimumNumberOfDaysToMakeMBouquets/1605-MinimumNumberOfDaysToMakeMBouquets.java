// Last updated: 7/31/2025, 5:30:44 PM
class Solution {
    public int minDays(int[] by, int m, int k) {
        int max =0;
        for(int i=0; i<by.length; i++){
            max= Math.max(max, by[i]);
        }
        int si =1;
        int min  =  max;
        int ck =-1;
        while(si<=max){
            int mid = si+(max-si)/2;
            if(check(by,m,k,mid)){
                min=Math.min(min, mid);
                max = mid-1;
                ck=0;
            }
            else{
                si = mid+1;
            }

        }
        if(ck==-1){
            return -1;
        }
        return min;

    }
    public static boolean check(int[] by, int m, int k, int t){
        int c=0;
        int cn=0;
        int i=0;
        while(i<by.length){
            if(by[i]<=t){
                c++;
            }
            else{
                cn+=(c/k);
                c=0;
            }
            if(cn==m){
                return true;
            }
            i++;
        }
        cn+=(c/k);
        if(cn>=m){
            return true;
        }
        return false;
    }
}