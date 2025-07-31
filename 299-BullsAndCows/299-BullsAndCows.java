// Last updated: 7/31/2025, 5:35:19 PM
class Solution {
    public String getHint(String secret, String guess) {
        int bn =0;
        int[] sc = new int[10];
        int[] gu = new int[10];
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bn++;
                continue;
            }
            sc[secret.charAt(i)-'0']++;
            gu[guess.charAt(i)-'0']++;
        }
        int cn=0;
        for(int i=0; i<10; i++){
            if(sc[i]==0 || gu[i]==0){
                continue;
            }
            cn=cn+ Math.min(sc[i],gu[i]);
        }
        String ans = String.valueOf(bn)+"A"+String.valueOf(cn)+"B";
        return ans;

        
    }
}