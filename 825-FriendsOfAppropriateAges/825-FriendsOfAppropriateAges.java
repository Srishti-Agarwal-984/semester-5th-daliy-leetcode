// Last updated: 9/16/2025, 11:59:47 PM
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for(int age : ages){
            count[age]++;
        }

        int ans = 0;
        for(int i = 0; i<121; i++){
            for(int j = 0; j<121; j++){
                int counta = count[i];
                int countb = count[j];

                if(counta == 0 || countb == 0){
                    continue;
                }
               
                if(j <= (0.5*i+7)){
                    continue;
                }
                if(j > i){
                    continue;
                }
                if(j > 100 && i < 100){
                    continue;
                }

                ans += counta*countb;
                if(i == j){
                    ans-=counta;
                }
            }
        }
        return ans;
    }
}