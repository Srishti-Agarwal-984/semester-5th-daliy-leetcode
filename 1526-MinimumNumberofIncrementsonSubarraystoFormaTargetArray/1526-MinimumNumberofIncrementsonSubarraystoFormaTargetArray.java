// Last updated: 10/30/2025, 10:23:05 AM
class Solution {
    public int minNumberOperations(int[] target) {
        int ans =0;
        Stack<Integer> st = new Stack<>();
        st.push(target[0]);
        for(int i=1; i<target.length; i++){
            if(!st.isEmpty() && st.peek()>=target[i]){
                ans=ans+st.pop()-target[i];
                while(!st.isEmpty() && st.peek()>=target[i]){
                    st.pop();
                }
            }
            st.push(target[i]);
        }
        int max=0;
        while(!st.isEmpty()){
            max = Math.max(max,st.pop());
        }
        return ans+max;
    }
}