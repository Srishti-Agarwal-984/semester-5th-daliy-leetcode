// Last updated: 9/30/2025, 11:35:43 PM
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int a= king[0], b=king[1];
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=a-1; i>=0; i--){
            if(helper(i,b,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(i);
                ans1.add(b);
                ans.add(ans1);
                break;
            }
        }
        for(int i=a+1; i<8; i++){
            if(helper(i,b,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(i);
                ans1.add(b);
                ans.add(ans1);
                break;
            }
        }
        for(int i=b-1; i>=0; i--){
            if(helper(a,i,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(a);
                ans1.add(i);
                ans.add(ans1);
                break;
            }
        }
        for(int i=b+1; i<8; i++){
            if(helper(a,i,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(a);
                ans1.add(i);
                ans.add(ans1);
                break;
            }
        }
        int s1=a-1, s2=b-1; 
        while(s1>=0 && s2>=0){
            if(helper(s1,s2,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(s1);
                ans1.add(s2);
                ans.add(ans1);
                break;
            }
            s1--;
            s2--;
        }
        s1=a+1;
         s2=b+1; 
        while(s1<8 && s2<8){
            if(helper(s1,s2,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(s1);
                ans1.add(s2);
                ans.add(ans1);
                break;
            }
            s1++;
            s2++;
        }
        s1=a-1;
         s2=b+1; 
        while(s1>=0 && s2<8){
            if(helper(s1,s2,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(s1);
                ans1.add(s2);
                ans.add(ans1);
                break;
            }
            s1--;
            s2++;
        }
        s1=a+1;
         s2=b-1; 
        while(s2>=0 && s1<8){
            if(helper(s1,s2,queens)){
                List<Integer> ans1= new ArrayList<>();
                ans1.add(s1);
                ans1.add(s2);
                ans.add(ans1);
                break;
            }
            s2--;
            s1++;
        }
        return ans;
    }
    public boolean helper(int q1, int q2,int[][] queens){
        for(int i1=0; i1<queens.length; i1++){
            if(queens[i1][0]==q1 && queens[i1][1]==q2){
                return true;
            }
            
        }
        return false;
    }
}
