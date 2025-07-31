// Last updated: 7/31/2025, 5:26:39 PM
class Solution {
    public long calculateScore(String s) {
        Stack<Integer>[] df = new Stack[26];
        for(int i=0; i<26; i++){
            df[i]=new Stack<>();
        }
        long ans =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!df['z'-c].isEmpty()){
                ans+=i-df['z'-c].pop();
            }
            else{
                df[c-'a'].push(i);
            }
        }
        return ans;
        
    }
}