// Last updated: 7/31/2025, 5:29:48 PM
class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int si=0, i=0, n = s.length(); 
        int ans =0;
        int c=0;
        while(i<n){
            if(s.charAt(i)!='T'){
                c++;
            }
            while(c>k && si<=i){
                if(s.charAt(si)!='T'){
                    c--;
                }
                si++;
            }
            
            ans = Math.max(ans, i-si+1);
            i++;
        }
        si=0;
        i=0;
        int ans1 = ans;
        ans=0;
        c=0;
        while(i<n){
            if(s.charAt(i)!='F'){
                c++;
            }
            while(c>k && si<=i){
                if(s.charAt(si)!='F'){
                    c--;
                }
                si++;
            }
            ans = Math.max(ans, i-si+1);
            i++;
        }
        return Math.max(ans, ans1);
    
    

    }
}