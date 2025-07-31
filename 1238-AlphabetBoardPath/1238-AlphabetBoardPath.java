// Last updated: 7/31/2025, 5:31:52 PM
class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        int si=0, sj=0;
        while(i<target.length()){
            int w = target.charAt(i)-'a';
            int r = w/5;
            int e = w%5;
            while(sj>e){
                ans.append("L");
                sj--;
            }
            while(si<r){
                ans.append("D");
                si++;

            }
            while(si>r){
                ans.append("U");
                si--;
            }
            while(sj<e){
                ans.append("R");
                sj++;

            }
            
            if(sj==e && si==r){
                ans.append("!");
            }
            i++;
            

        }
        return ans.toString();
      

        
    }
}