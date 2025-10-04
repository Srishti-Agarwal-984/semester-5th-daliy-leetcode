// Last updated: 10/4/2025, 9:25:26 PM
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int ans=0;
        int si=0,en=price[price.length-1]-price[0];
        while(si<=en){
            int mid=si+(en-si)/2;
            if(helper(mid,k,price)){
                ans=Math.max(ans,mid);
                si=mid+1;
            }else{
                en=mid-1;
            }
        }
        return ans;
    }
    public boolean helper(int mid, int  k, int[] price){
        int c=0;
        int si=0;
        k=k-1;
        for(int i=1; i<price.length; i++){
            if(price[i]-price[si]>=mid){
                k--;
                si=i;
            }
            if(k==0){
                return true;

            }
        }
        return false;
    }
}