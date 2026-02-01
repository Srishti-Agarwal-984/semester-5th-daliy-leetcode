// Last updated: 2/1/2026, 9:33:55 AM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int sum=nums[0];
4        int[] arr = new int[nums.length-1];
5        for(int i=0; i<arr.length; i++){
6            arr[i]=nums[i+1];
7        }
8        Arrays.sort(arr);
9
10
11        
12        
13
14        return sum+arr[0]+arr[1];
15        
16    }
17}