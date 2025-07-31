// Last updated: 7/31/2025, 5:32:07 PM
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer>  st = new Stack<>();
       String ans ="";

       for(int i=0; i<s.length(); i++){
            if(!st.isEmpty() && s.charAt(st.peek())=='(' && s.charAt(i)==')' ){
                if(st.size()==1){
                    int r = st.peek()+1;
                    ans+=s.substring(r,i);
  
                }
                st.pop();   
            }
            else{
                st.push(i);
            }
       }
       return ans;
    }
}