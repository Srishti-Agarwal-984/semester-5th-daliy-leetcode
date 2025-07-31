// Last updated: 7/31/2025, 5:37:18 PM
class Solution {
    public List<String> restoreIpAddresses(String s) {
List<String> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        akl(s,ans,temp,0);
        return ans;
        
    }
    public static void akl(String s, List<String> ans, List<String> temp, int idx){
        if(temp.size()>4){
            return;
        }
        if(idx== s.length() && temp.size()==4){
            ans.add(String.join(".",temp));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            if(isp(s.substring(idx,i+1))){
                temp.add(s.substring(idx,i+1));
                akl(s,ans, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isp(String jkl){
        if(jkl.length()>3 || (jkl.length()>1 && jkl.charAt(0)=='0')){
            return false;
        }
        if(Integer.parseInt(jkl)>255){
            return false;
        }
        return true;
    }
}