// Last updated: 10/6/2025, 10:26:44 PM
class Solution {
    int c=0,l=0;
    public boolean isInterleave(String s1, String s2, String s3) {
        //int[][][] dp=new int[s1.length()+1][s2.length()+1][s3.length()+1];
        if(s1.length()==0 && s2.length()==0 && s3.length()==0){
            return true;
        }
        if(s3.length()==1 && s1.length()>=1 && s2.length()>=1){
            return false;
        }
        if(s3.length()>1 && ((s1.length()==0 && s2.length()!=s3.length())||(s2.length()==0 && s1.length()!=s3.length()))){
            return false;
        }
        if((s1.indexOf(s3)>=0 && s2.length()!=0) || (s1.length()!=0 && s2.indexOf(s3)>=0)){
            return false;
        }
        int[][][] dp =new int[s1.length()+1][s2.length()+1][s3.length()+1];
        return helper(s1, s2,s3, 0, 0, 0,dp);

    }
    public boolean helper(String s1, String s2, String s3, int i, int j, int k,int[][][] dp){
        if(k>=s3.length()){
            //System.out.println("*");
            return true;
        }
        if(i>=s1.length() && j>=s2.length()){
            return false;
        }
        if(dp[i][j][k]!=0){
            return dp[i][j][k]==1;
        }
        boolean ans=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            //System.out.println(s1.charAt(i)+"->!"+i);
            c++;
            ans=helper(s1,s2,s3, i+1, j, k+1,dp); 
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            l++;
            //System.out.println(s2.charAt(j)+"->"+j);
            ans= ans||helper(s1,s2,s3, i, j+1, k+1,dp);
        }
        if(i<s1.length() && s1.charAt(i)!=s3.charAt(k) && j<s2.length() && s2.charAt(j)!=s3.charAt(k)){
            boolean q=false;
            if(i<s1.length()){
                q=helper(s1,s2,s3, i+1, j, k,dp);
            }
            boolean p = false;
            if(j<s2.length()){
                p=helper(s1,s2,s3, i, j+1, k,dp);
            }
            ans=ans||q||p;
        }
        dp[i][j][k]=ans?1:-1;
        return ans;

    }
}