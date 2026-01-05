// Last updated: 1/5/2026, 1:07:22 PM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> ans  = new ArrayList<>();
4        ans.add(words[0]);
5        for(int i=1; i<groups.length; i++){
6            if(groups[i]!=groups[i-1]){
7                ans.add(words[i]);
8            }
9        }
10        return ans;
11    }
12}