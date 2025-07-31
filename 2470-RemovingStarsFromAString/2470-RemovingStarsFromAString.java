// Last updated: 7/31/2025, 5:28:48 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        String kl="";
        while(!st.isEmpty()){
            kl=st.pop()+kl;
        }
        return kl;
        
    }
}