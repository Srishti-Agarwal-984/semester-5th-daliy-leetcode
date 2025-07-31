// Last updated: 7/31/2025, 5:32:18 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i=0;

        while(i<s.length()){
            if(!st.isEmpty() && s.charAt(i)=='c' ){
                char ch = st.pop();
                if(!st.isEmpty() && st.peek()=='a' && ch=='b'){
                    st.pop();
                    i=i+1;
                    continue;
                }
                else{
                    st.push(ch);
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }
            i++;

        }
        return st.isEmpty();
        
    }
}