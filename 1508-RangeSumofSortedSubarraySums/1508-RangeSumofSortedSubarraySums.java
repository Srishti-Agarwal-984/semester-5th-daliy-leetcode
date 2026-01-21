// Last updated: 1/21/2026, 11:27:00 PM
1class Solution {
2    int mod = 1000000007;
3    public int rangeSum(int[] nums, int n, int left, int right) {
4        List<Integer> li = new ArrayList<>();
5        for(int i=0; i<nums.length; i++){
6            int sum=0;
7            for(int j=i; j<nums.length; j++){
8                sum=sum+nums[j];
9                li.add(sum);
10            }
11        }
12        Collections.sort(li);
13        long df=0;
14        for(int i=left-1; i<right; i++){
15            df=(df+li.get(i)%mod)%mod;
16
17        }
18        return (int)df;
19
20        
21    }
22}