// Last updated: 7/31/2025, 5:33:00 PM
class Solution {
    //static List<String> str = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        List<String> str = new ArrayList<>();
        ans(s, 0,"",str);
        return str;

       

        
    }
    public static void ans(String s, int i,String kl,List<String> str ){
        if(i==s.length()){
            str.add(kl);
            return;
        }
        ans(s,i+1,kl+s.charAt(i),str);
        if(s.charAt(i)-48>9){
            int u = s.charAt(i);
            if(u>=97){
                u=u-32;
            }
            else{
                u+=32;
            }
            char df = (char)(u);
            ans(s,i+1,kl+df,str);
        }
        
    }
}