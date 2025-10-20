// Last updated: 10/20/2025, 6:23:17 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0; i<operations.length;i++){
            if(operations[i].charAt(0)=='+'|| operations[i].charAt(2)=='+'){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}