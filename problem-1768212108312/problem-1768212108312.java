// Last updated: 1/12/2026, 3:31:48 PM
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        int ans=0;
4        for(int i=0; i<nums.length; i++){
5            long sum=0;
6            HashSet<Long> st = new HashSet<>();
7            for(int j=i; j<nums.length; j++){
8                st.add((long)nums[j]);
9                sum =sum+nums[j];
10                if(st.contains(sum)){
11                    ans++;
12                }
13                
14                
15            }
16        }
17        return ans;
18        
19    }
20}