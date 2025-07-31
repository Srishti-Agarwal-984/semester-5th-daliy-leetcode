// Last updated: 7/31/2025, 5:30:30 PM
class Solution {
    public int minDeletions(String s) {
        int[] df = new int[26];
        for(int i=0; i<s.length(); i++){
            df[s.charAt(i)-97]++;

        }
        Arrays.sort(df);
        int del = 0; // Initialize the deletion count
        
        for (int i = 24; i >= 0; i--) {
            if (df[i] == 0) {
                break; // No more characters with this frequency
            }
            
            if (df[i] >= df[i + 1]) {
                int prev = df[i];
                df[i] = Math.max(0, df[i + 1] - 1);
                del += prev - df[i]; // Update the deletion count
            }
        }
        
        return del;
    }
}