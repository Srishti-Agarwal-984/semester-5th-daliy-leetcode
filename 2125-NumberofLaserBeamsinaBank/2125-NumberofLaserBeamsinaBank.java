// Last updated: 10/27/2025, 10:50:18 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        List<Integer> li = new ArrayList<>();
        for(String s: bank){
            int cn=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    cn++;
                }

            }
            if(cn>0){
                li.add(cn);
            }
        }
        for(int i=1; i<li.size(); i++){
            ans = ans+li.get(i)*li.get(i-1);
        }
        return ans;
    }
}