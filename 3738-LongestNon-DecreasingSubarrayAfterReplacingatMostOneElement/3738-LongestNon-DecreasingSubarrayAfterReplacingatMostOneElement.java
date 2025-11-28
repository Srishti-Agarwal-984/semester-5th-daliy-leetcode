// Last updated: 11/28/2025, 2:36:55 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        if(nums.length<=2){
4            return nums.length;
5        }
6        int r=0;
7        int[] p = new int[nums.length];
8        int[] s = new int[nums.length];
9        p[0]=1;
10        int prev=Integer.MIN_VALUE;
11        for(int i=1; i<nums.length; i++){
12            if(nums[i-1]<=nums[i]){
13                p[i]+=p[i-1]+1;
14            }
15            else{
16                p[i]=1;
17            }
18        }
19        prev=Integer.MAX_VALUE;
20        s[nums.length-1]=1;
21        for(int i=nums.length-2; i>=0; i--){
22            if(nums[i]<=nums[i+1]){
23                s[i]+=s[i+1]+1;
24            }
25            else{
26                s[i]=1;
27            }
28        }
29        int n = nums.length;
30        int ans= Math.min(n, Arrays.stream(p).max().getAsInt() + 1);;
31        for(int i=1; i<nums.length-1; i++){
32            if(nums[i-1]<=nums[i+1]){
33                ans=Math.max(ans, p[i-1]+s[i+1]+1);
34            }
35            
36            // else{
37            //     ans=Math.max(ans, Math.max(p[i]+1, s[i]+1));
38            // }
39        }
40        // ans=Math.max(ans, Math.max(p[0], s[0]+1));
41        // ans=Math.max(ans, Math.max(p[nums.length-1]+1, s[nums.length-1]));
42        return ans;
43
44
45
46    }
47}