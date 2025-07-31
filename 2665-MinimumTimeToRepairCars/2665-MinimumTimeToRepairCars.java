// Last updated: 7/31/2025, 5:28:13 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long h=(long) Arrays.stream(ranks).min().getAsInt() * cars * cars;
        long k=1;
        long ans=h;
        while(k<h){
            long mid = (h+k)/2;
            if(IsIt(mid,ranks,cars)){
                ans=Math.min(ans,mid);
                h=mid;
            }
            else{
                k=mid+1;
            }
        }
        return k;
    }
    public static boolean IsIt(long mid,int[] ranks, int cars){
        long y=cars;
        long p=0;
        for(int i=0; i<ranks.length; i++){
            p+=(long)(Math.sqrt(mid/ranks[i]));
            if(p>=cars){
                return true;
            }
        }
        return false;
    }
}