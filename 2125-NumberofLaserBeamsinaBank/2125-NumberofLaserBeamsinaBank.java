// Last updated: 10/27/2025, 10:51:50 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int prev=0;
        //List<Integer> li = new ArrayList<>();
        for(String s: bank){
            int cn=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    cn++;
                }

            }
            if(cn>0){
                
                ans=ans+prev*cn;
                prev=cn;
            }
        }
        // for(int i=1; i<li.size(); i++){
        //     ans = ans+li.get(i)*li.get(i-1);
        // }
        return ans;
    }
}