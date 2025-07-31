// Last updated: 7/31/2025, 5:32:49 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int g=0;
        int sum =0;
        for(int i=0; i<piles.length; i++){
            sum= sum + piles[i];
        }
        if(piles.length==1){
            if(piles[0]%h==0){
                return piles[0]/h;
            }
            else{
                return (piles[0]/h)+1;
            }
        }
        int p = piles[piles.length-1];
        int k=p;
        int i =0;
        while(i<=p){
            int mid = i+(p-i)/2;
            // System.out.println(mid);
            if( mid!=0 && ans(mid, piles, h)){
                k= mid;
                p = mid-1;
                
            }
            else{
                i=mid+1;
            }
        }
        return k; 
    }
    public static boolean ans(int mid , int[] piles, int h){
        int c=0;
        for(int l=0; l<piles.length; l++){
            if(piles[l]<mid){
                c=c+1;
            }
            else if(piles[l]%mid==0){
                c=c+(piles[l]/mid);
            }
            else{
                c=c+(piles[l]/mid)+1;
            }
            if(c>h){
                return false;
            }
        }
        return true;
    }
}