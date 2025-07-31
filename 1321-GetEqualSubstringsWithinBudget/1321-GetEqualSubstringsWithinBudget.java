// Last updated: 7/31/2025, 5:31:39 PM
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] ar= new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int y = Math.abs(s.charAt(i)-t.charAt(i));
            ar[i]=y;
        }
        int j=0;
        int c=0;
        int sum=0;
        int l=0;
        int ml=0;
        while(j<s.length()){
            sum=sum+ar[j];
            while(sum>maxCost){
                sum=sum-ar[l];
                l++;
            }
            ml=Math.max(ml,j-l+1);
            j++;
        }
        return ml;
        
    }
}