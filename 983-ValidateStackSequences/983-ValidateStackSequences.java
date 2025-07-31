// Last updated: 7/31/2025, 5:32:31 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;
        Stack<Integer> st = new Stack<>();
        while (i < pushed.length) {
            while (!st.isEmpty() && st.peek() == popped[j]) {
                j++;
                st.pop();
            }
            st.push(pushed[i]);
            i++;
        }
        while (!st.isEmpty() && st.peek() == popped[j]) {
            j++;
            st.pop();
        }
        return st.isEmpty();

    }
}