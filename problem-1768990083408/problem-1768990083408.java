// Last updated: 1/21/2026, 3:38:03 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        int ans=0;
4        int i=0;
5        Stack<int[]> st = new Stack<>();
6        while(i<nums.length){
7            int step=0;
8            while(!st.isEmpty() && st.peek()[0]<=nums[i]){
9                step = Math.max(step, st.pop()[1]);
10            }
11            if(!st.isEmpty()){
12                step++;
13            }
14            ans  = Math.max(ans, step);
15            st.push(new int[]{nums[i], step});
16            i++;
17        }
18        return ans;
19        
20        
21    }
22}