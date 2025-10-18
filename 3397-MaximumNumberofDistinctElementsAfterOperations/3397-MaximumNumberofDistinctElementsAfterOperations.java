// Last updated: 10/18/2025, 6:27:04 PM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        Stack<Integer> st=new Stack<>();
        st.add(nums[0]-k);
        for(int i=1;i<nums.length; i++){
            int a=nums[i]-k;
            int b=nums[i]+k;
            if(st.peek()<a){
                st.push(a);
            }
            else{
                if(st.peek()<b && st.peek()>=a){
                    st.add(st.peek()+1);
                }
            }
        }
        return st.size();
    }
}