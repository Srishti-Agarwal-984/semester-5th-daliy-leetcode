// Last updated: 7/31/2025, 5:27:43 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x)>=0){
                ans.add(i);
            }
        }
        return ans;
    }
}