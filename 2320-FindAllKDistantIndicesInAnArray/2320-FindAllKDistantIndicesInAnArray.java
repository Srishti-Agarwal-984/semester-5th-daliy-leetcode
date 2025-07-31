// Last updated: 7/31/2025, 5:29:08 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> st = new ArrayList<>();
        HashSet<Integer> st1 = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                st.add(i);
                st1.add(i);
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<st.size(); j++){
                int r = Math.abs(i-st.get(j));
                if(r<=k){
                    st1.add(i);
                    break;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i: st1){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;

    }
}