// Last updated: 7/31/2025, 5:33:59 PM
class Solution {
    int c=0;
    public int countArrangement(int n) {
        if(n<=2){
            return n;
        }
        List<Integer> df = new ArrayList<>();
        helper(n, df);
        int ans=c;
        return ans;

    }
    public  void  helper(int n, List<Integer> df ){
        if(df.size()==n){
            c++;
            return;
        }
        for(int j=1; j<=n; j++){
            if(asd(df, j)){
                df.add(j);
                helper(n, df);
                df.remove(df.size()-1);
            }
        }
    }
    public boolean asd(List<Integer> df , int item){
        if( df.size()==0 || item%(df.size()+1)==0|| (df.size()+1)%item==0){
            if(df.size()==0){
                return true;
            }
            if(df.indexOf(item)<0){
                return true;
            }

        }
        return false;
    }

}