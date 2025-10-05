// Last updated: 10/5/2025, 8:58:14 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        int k1=(int)(Math.pow(2,k));
        HashSet<String> st = new HashSet<>();
        for(int i=0; i<s.length();i++){
            if(i+k>s.length()){
                break;
            }
            st.add(s.substring(i,i+k));
        }
        return st.size()>=k1;
    }
}