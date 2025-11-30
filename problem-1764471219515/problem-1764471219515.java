// Last updated: 11/30/2025, 8:23:39 AM
1class Solution {
2    public int maxDistinct(String s) {
3        int[] freq = new int[26];
4        int nas=0;
5        for(int i=0; i<s.length(); i++){
6            if(freq[s.charAt(i)-'a']==0){
7                nas++;
8            }
9            freq[s.charAt(i)-'a']++;
10        }
11        return nas;
12        
13    }
14}