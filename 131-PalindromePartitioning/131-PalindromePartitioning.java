// Last updated: 7/31/2025, 5:36:43 PM
class Solution {
    //static List<List<String>> ans = new  ArrayList<>();

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new  ArrayList<>();

        List<String> ans1 = new  ArrayList<>();
        palindrome_partitioning(s,ans1,ans);
        return ans;

    }
    public static void palindrome_partitioning(String s,List<String> ans1,List<List<String>> ans ){
        if(s.length()==0){
            ans.add(new  ArrayList<>(ans1));
            return;
        }
        for(int i=1; i<=s.length(); i++){
            String j = s.substring(0,i);
            if(Is_Palindrome(j)){
                ans1.add(j);
                palindrome_partitioning(s.substring(i),ans1,ans);
                ans1.remove(ans1.size()-1);
            }
        }
    }
    public static boolean Is_Palindrome(String j){
        int r=0, l= j.length()-1;
        while(r<=l){
            if(j.charAt(r)!=j.charAt(l)){
                return false;
            }
            r++;
            l--;
        }
        return true;
    }
}