// Last updated: 7/31/2025, 5:36:26 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].charAt(0)=='/' ){
                int u = st.pop();
                int r = st.pop();
                st.push(r/u);
            }
            else if(tokens[i].charAt(0)=='*'){
                int u = st.pop();
                int r = st.pop();
                st.push(r*u);

            }
            else if(tokens[i].charAt(0)=='+' && tokens[i].length()==1){
                int u = st.pop();
                int r = st.pop();
                st.push(r+u);

            }else if(tokens[i].charAt(0)=='-' && tokens[i].length()==1){
                int u = st.pop();
                int r = st.pop();
                st.push(r-u);

            }else {
                st.push(Integer.parseInt(tokens[i]));

            }
            
        }
        return st.peek();
    }
}