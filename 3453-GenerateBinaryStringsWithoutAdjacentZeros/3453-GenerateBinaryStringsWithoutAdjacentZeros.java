// Last updated: 7/31/2025, 5:27:15 PM
class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, ans, "");
        return ans;
        
    }
    public static void helper(int n, List<String> ans, String kl){
        if(n==0){
            ans.add(kl);
            return;
        }
        if(kl.equals("") || kl.charAt(kl.length()-1)=='1'){
            helper(n-1, ans, kl+"0");
        }
        helper(n-1, ans, kl+"1");

    }
}