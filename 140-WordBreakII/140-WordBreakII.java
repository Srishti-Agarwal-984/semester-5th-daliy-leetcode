// Last updated: 11/9/2025, 9:33:21 PM
class Solution {
    Set<String> ans = new HashSet<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        helper(s, wordDict, "", "");
        List<String> li = new ArrayList<>();
        for(String s1: ans){
            li.add(s1);
        }
        return li;

        
    }
    public void helper(String s, List<String> wordDict, String k, String l){
        if(k.length()==s.length() && k.equals(s)){
            ans.add(l.substring(0, l.length()-1));
            return;
        }
        for(int i=0; i<wordDict.size(); i++){
            if((k.length()+wordDict.get(i).length())<=s.length() && s.indexOf(k+wordDict.get(i))==0){
                helper(s, wordDict, k+wordDict.get(i), l+wordDict.get(i)+" ");
            }
            
        }
    }

}