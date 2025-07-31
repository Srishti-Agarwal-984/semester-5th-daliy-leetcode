// Last updated: 7/31/2025, 5:26:40 PM
class Solution {
    static int n =1000000007;
    public int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        while(t-->0){
            int[] temp = new int[26];
            for(int i=0; i<25; i++){
                temp[i+1]=freq[i];
            }
            temp[0]=(temp[0]+freq[25])%n;
            temp[1]=(temp[1]+freq[25])%n;
            freq = temp;

        }
        long sum=0; 
        for(int i=0; i<26; i++){
            sum=(sum+freq[i])%n;
        }
        return (int)(sum%n);
        
    }
}