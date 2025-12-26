// Last updated: 12/26/2025, 7:39:34 PM
1class Solution {
2    public int minAbsoluteDifference(List<Integer> nums, int x) {
3        TreeSet<Integer> st = new TreeSet<>();
4        int ans = Integer.MAX_VALUE;
5        for(int i = x; i<nums.size(); i++){
6            st.add(nums.get(i-x));
7            Integer f = st.floor(nums.get(i));
8            if(f != null){
9                ans = Math.min(ans,Math.abs(nums.get(i)-f));
10            }
11            Integer c = st.ceiling(nums.get(i));
12            if(c != null){
13                ans = Math.min(ans,Math.abs(nums.get(i)-c));
14            }
15        }
16        return ans;
17    }
18}