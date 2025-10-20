// Last updated: 10/20/2025, 12:40:12 PM
class Solution {
Integer memo[][];
    public int tallestBillboard(int[] rods) {
        memo=new Integer[rods.length][10002];
        return tallestBillboard(rods,0,0);
    }
    public int tallestBillboard(int[] rods,int si, int diff) {
        if(si>=rods.length){
             if(diff==0){
                 return 0;
             }
             return Integer.MIN_VALUE;
        }
        if(memo[si][diff+5001]!=null){
            return memo[si][diff+5001];
        }
        int addWithSupport1 = rods[si]+tallestBillboard(rods,si+1,rods[si]+diff); //**
        int addWithSupport2 = tallestBillboard(rods,si+1,diff-rods[si]);
        int addWithNone = tallestBillboard(rods,si+1,diff);
        return memo[si][diff+5001] = Math.max(addWithNone, Math.max(addWithSupport1,addWithSupport2));
    }
}