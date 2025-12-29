// Last updated: 12/29/2025, 4:52:43 PM
1class Solution {
2    int sum = 0;
3    public int subsetXORSum(int[] nums) {
4        Arrays.sort(nums);
5        helper(nums, 0, 0);
6        return sum;
7
8
9        
10    }
11    public void helper(int[] nums, int i, int u){
12
13        if(i>=nums.length){
14            sum+=u;
15            return;
16        }
17        helper(nums, i+1,  nums[i]^u);
18        helper(nums, i+1, u);
19
20    }
21}