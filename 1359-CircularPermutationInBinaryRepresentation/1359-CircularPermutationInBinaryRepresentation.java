// Last updated: 7/31/2025, 5:31:32 PM
class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> st = new ArrayList<>();
        for(int i=0; i<(1<<n); i++){
            st.add(start^i^(i>>1));
        }
        return st;
    }
}