// Last updated: 7/31/2025, 5:29:15 PM
class Solution {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];
        if(num%3!=0){
            return new long[0];

        }
        ans[1] =  num/3;
        ans[0]=ans[1]-1;
        ans[2]=ans[1]+1;
        return ans;

    }
}