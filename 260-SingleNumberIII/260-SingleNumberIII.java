// Last updated: 1/14/2026, 12:12:16 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int[] ans = new int[2];
4        int j=0, i=0;
5        Arrays.sort(nums);
6        while(i<nums.length){
7            if(i<nums.length-1 &&( nums[i]^nums[i+1])==0){
8                i=i+2;
9            }
10            else{
11                ans[j]=nums[i];
12                i++;
13                j++;
14            }
15        }
16        return ans;
17        
18    }
19}