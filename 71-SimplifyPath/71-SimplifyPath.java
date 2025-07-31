// Last updated: 7/31/2025, 5:37:39 PM
class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] s = path.split("/");
        List<String> st = new ArrayList<>();
        for(int i=0; i<s.length; i++){
            if(s[i].equals("" )|| s[i].equals(".")){
                continue;

            }
            else if(s[i].equals("..")){
                if(st.size()>=1){
                    st.remove(st.size()-1);
                }
            }
            else{
                st.add(s[i]);
            }
        }
        for(String kl: st){
            sb.append("/").append(kl);
        }
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}