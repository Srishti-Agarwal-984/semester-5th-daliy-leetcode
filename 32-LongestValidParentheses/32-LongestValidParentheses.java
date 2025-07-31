// Last updated: 7/31/2025, 5:38:22 PM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        boolean[] as = new boolean[s.length()];
        int si =0;
        int ans =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                }
                else{
                    st= new Stack<>();
                }
            }
            else{
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            as[st.pop()]=true;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                    ans=Math.max(ans, i-si+1);
                }
                else{
                    si=i+1;
                    st= new Stack<>();
                }
            }
            else{
                if(as[i]){
                    si=i+1;
                    st= new Stack<>();
                }
                else{
                    st.push(i);
                }
            }
        }
        return ans;
        
    }
}