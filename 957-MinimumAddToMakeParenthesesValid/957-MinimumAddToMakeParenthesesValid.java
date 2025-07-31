// Last updated: 7/31/2025, 5:32:36 PM
import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));

            }
            else{
                if(s.charAt(i)==')' && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }

        }
        int u = st.size();
        return u;

        
    }
}