// Last updated: 7/31/2025, 5:27:59 PM
class Solution {
    static int c=1;
    public int punishmentNumber(int n) {
        int ans =0;
        for(int i=1; i<=n; i++){
            String kl = String.valueOf(i*i);
            if(isp(kl,i)|| c==0){
                ans+=i*i;
                c=1;
            }
        }
        return ans;
        
    }
    public static boolean isp(String kl, int target){
        if(kl.length()==0){
            if(target==0){
                c=0;
                return true;
            }
        }
        for(int i=1; i<=kl.length(); i++){
            String jk = kl.substring(0,i);
            if(target-Integer.parseInt(jk)>=0){
                isp(kl.substring(i), target-Integer.parseInt(jk));
            }
        }
        return false;
    }
}