// Last updated: 7/31/2025, 5:25:55 PM
class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==1){
                st.pop();
            }
            else if (!st.isEmpty() && ((s.charAt(i) == 'z' && st.peek() == 'a') ||
                    (st.peek() == 'z' && s.charAt(i) == 'a'))) {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
            
        }
        ans.reverse();
        return ans.toString();
    }
}