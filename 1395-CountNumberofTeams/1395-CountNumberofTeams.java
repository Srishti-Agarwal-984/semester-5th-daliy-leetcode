// Last updated: 1/20/2026, 11:00:00 AM
1class Solution {
2    public int numTeams(int[] nums) {
3        int ans=0;
4        for(int i=0; i<nums.length; i++){
5            for(int j=i+1; j<nums.length; j++){
6                for(int k=j+1; k<nums.length; k++){
7                    if((nums[i]>nums[j] && nums[j]>nums[k])||(nums[i]<nums[j] && nums[j]<nums[k]) ){
8                        ans++;
9                    }
10                }
11            }
12        }
13        return ans;
14        
15    }
16}