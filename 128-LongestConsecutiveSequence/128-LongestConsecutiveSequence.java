// Last updated: 7/31/2025, 5:36:47 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        List<Integer> st1 = new ArrayList<>();
        st1.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=st1.get(st1.size()-1)){
                st1.add(nums[i]);
            }
        }
        int c=1;
        int ans=1;
        for(int i=0; i<st1.size()-1; i++){
            if(st1.get(i+1)-st1.get(i)==1){
                c++;
            }
            else{
                ans=Math.max(ans, c);
                c=1;
            }

        }
        ans=Math.max(ans, c);
        return ans;
            
    }
}