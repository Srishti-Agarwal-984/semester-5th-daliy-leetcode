// Last updated: 7/31/2025, 5:25:53 PM
class Solution {
    public int minDeletion(String s, int k) {
        int[] ar = new int[26];
        for(int i=0; i<s.length(); i++){
            ar[s.charAt(i)-'a']++;
        }
        Arrays.sort(ar);
        int cn =0, l=0;
        for(int i=26-1; i>=0; i--){
            if(ar[i]>0){
                l=l+ar[i];
                cn++;
            }
            if(cn==k){
                break;
            }
        }
        int ans = s.length()-l;
        return ans;
        
    }
}