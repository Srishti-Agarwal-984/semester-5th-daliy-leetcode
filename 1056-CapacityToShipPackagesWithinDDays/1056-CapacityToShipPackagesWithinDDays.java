// Last updated: 7/31/2025, 5:32:09 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        long df =0;
        for(int i=0; i<weights.length; i++){
            df+=weights[i];
        }
        long si=0;
        long ans = df;
        while(si<=df){
            long mid = si+(df-si)/2;
            if(isp(mid, weights, days)){
                ans = mid;
                df = mid-1;
                //System.out.println(ans);
            }
            else{
                si=mid+1;
            }

        }
        return (int)ans;
        
    }
    public static boolean isp(long mid, int[] weights, int days){
        long jk =0;
        int cn=1, l=0;
        for(int i=0; i<weights.length; i++){
            jk+=weights[i];
            if(jk>mid){
                jk=0;
                i--;
                cn++;
            }
            if(cn>days){
                return false;
            }

        }
        return true;
    }
}