// Last updated: 12/22/2025, 11:59:12 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b)->(a[1]==b[1]? a[0]-b[0]:a[1]-b[1]));
4        int ans = 1;
5        int prev = intervals[0][1];
6        for(int i=1; i<intervals.length; i++){
7                if (intervals[i][0] >= prev) {
8                    prev = intervals[i][1];
9                    ans++;
10                }
11
12            }
13        return intervals.length-ans;
14        
15    }
16}