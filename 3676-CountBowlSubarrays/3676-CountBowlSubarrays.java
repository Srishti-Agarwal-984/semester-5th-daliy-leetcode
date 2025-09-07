// Last updated: 9/7/2025, 11:24:16 AM
class Solution {
    public long bowlSubarrays(int[] nums) {
        long ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nums.length; i++){
            while(!st.isEmpty() && st.peek()<nums[i]){
                if(st.size()>=2){
                    ans+=1;
                    System.out.println(st.size()-1);
                }
                st.pop();
            }
            st.push(nums[i]);
        }
        return ans;
        
    }
}