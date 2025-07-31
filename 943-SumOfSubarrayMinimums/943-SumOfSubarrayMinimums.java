// Last updated: 7/31/2025, 5:32:40 PM
class Solution {
    public int[] nse(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] pse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            ans[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] pse = pse(arr);
        int[] nse = nse(arr);
        long ans = 0;
        int mod = 1000000007;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            ans = (ans+(left*right*arr[i]))%mod;
        }
        return (int)ans;
    }
}