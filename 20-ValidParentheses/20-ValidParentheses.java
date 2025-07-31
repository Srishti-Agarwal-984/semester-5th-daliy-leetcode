// Last updated: 7/31/2025, 5:38:39 PM
import java.util.*;
class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==')'){
                    if(st.isEmpty() || st.peek()!='('){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
                if(s.charAt(i)=='}'){
                    if(st.isEmpty() || st.peek()!='{'){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
                if(s.charAt(i)==']'){
                    if(st.isEmpty() || st.peek()!='['){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;

        
    }
}