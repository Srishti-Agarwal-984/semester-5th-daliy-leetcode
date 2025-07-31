// Last updated: 7/31/2025, 5:30:58 PM
class Solution {
    public int maxScore(String s) {
        int s1 =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                s1++;
            }
        }
        int sum=0, p=0;
        int left =0, right=0;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='0'){
                left++;
            }
            else{
                right++;
            }
            p  =left+s1-right;
            // System.out.println(p);
            sum = Math.max(sum, p);
            // System.out.println(sum);
        }
        
        

        return sum;

        
    }
}