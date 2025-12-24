// Last updated: 12/24/2025, 11:21:55 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int si=0, en = height.length-1;
4        int ans=0;
5        while(si<en){
6            int h = Math.min(height[si], height[en]);
7            int l = en-si;
8            ans = Math.max(ans, h*l);
9            if(height[si]<height[en]){
10                si++;
11            }
12            else{
13                en--;
14            }
15
16        }
17        return ans;
18        
19    }
20}