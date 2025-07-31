// Last updated: 7/31/2025, 5:31:34 PM
class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int prev=0;
        st.add(0);
        for(int i=1; i<nums.length; i++){
            if(st.size()%2!=0 && nums[st.peek()]==nums[i]){
                continue;
            }
            st.push(i);
        }
        if(st.size()%2!=0){
            return nums.length-st.size()+1;
        }
        
        return  nums.length-st.size();
        
    }
}