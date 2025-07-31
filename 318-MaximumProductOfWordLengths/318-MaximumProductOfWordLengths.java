// Last updated: 7/31/2025, 5:35:16 PM
class Solution {
    public int maxProduct(String[] words) {
        int ans=0;
        int[][] arr = new int[words.length][26];
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                arr[i][words[i].charAt(j)-'a']++;
            }

        }
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(helper(arr[i],arr[j])){
                    ans=Math.max(words[i].length()*words[j].length(), ans);
                }
            }
            //ans = Math.max(ans, p);
        }
        return ans;
        
    }
    public boolean helper(int[] q, int[] r){
        for(int i=0; i<26; i++){
            if(q[i]!=0 && r[i]!=0){
                return false;
            }
        }
        return true;
    }
}