// Last updated: 1/2/2026, 8:14:39 AM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashSet<Integer> st = new HashSet<>();
4        for(int i: nums){
5            if(st.contains(i)){
6                return i;
7            }
8            st.add(i);
9        }
10        return nums[0];
11
12        
13    }
14}