// Last updated: 7/31/2025, 5:26:17 PM
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        int mineven = Integer.MAX_VALUE;
        int maxodd = Integer.MIN_VALUE;
        for(int i=25; i>=0; i--){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2!=0){
                maxodd=Math.max(maxodd, freq[i]);
            }
            else{
                mineven=Math.min(mineven, freq[i]);
            }
        }

        return maxodd-mineven;
    }
}