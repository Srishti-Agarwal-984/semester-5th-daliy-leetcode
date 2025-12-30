// Last updated: 12/30/2025, 6:50:08 PM
1class Solution {
2    public int numSquarefulPerms(int[] nums) {
3        int ans = 0;
4        Arrays.sort(nums);
5        HashSet<Integer> st = new HashSet<>();
6
7        for(int i=0; i<nums.length; i++){
8            if(i>0 && nums[i-1]==nums[i]){
9                continue;
10            }
11            
12            st.add(i);
13            ans+=helper(nums, nums[i], st);
14            st.remove(i);
15        }
16        return ans;
17        
18    }
19    public int helper(int[] nums, int prev, HashSet<Integer> st){
20        if(st.size()==nums.length){
21            return 1;
22        }
23        int ans = 0;
24        for(int i=0; i<nums.length; i++){
25           if (i > 0 && nums[i] == nums[i-1] && !st.contains(i-1)) continue;
26
27            if(st.contains(i)){
28                continue;
29            }
30            int n = nums[i]+prev;
31            int k =(int)(Math.pow(n,0.5));
32            if(n==k*k){
33                st.add(i);
34                ans+=helper(nums, nums[i], st);
35                st.remove(i);
36            }
37        }
38        return ans;
39    }
40}