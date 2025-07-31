// Last updated: 7/31/2025, 5:25:31 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int u= n;
        int p=1, s=0;
        while(n!=0){
            p=p*(n%10);
            s+=n%10;
            n=n/10;

        }
        //System.out.println(p);
        return u%(p+s)==0;
    }
}