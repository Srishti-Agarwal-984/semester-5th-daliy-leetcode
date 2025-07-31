// Last updated: 7/31/2025, 5:27:49 PM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans  = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1; i<groups.length; i++){
            if(groups[i]!=groups[i-1]){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}