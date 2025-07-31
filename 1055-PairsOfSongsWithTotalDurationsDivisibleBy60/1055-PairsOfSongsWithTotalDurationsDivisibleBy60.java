// Last updated: 7/31/2025, 5:32:11 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long [] arr = new long[60];
        for(int i=0; i<time.length; i++){
            int d = time[i]%60;
            arr[d]= arr[d] +1;
        }
        long c =0;
        if(arr[0]>=2){
            long m = (arr[0]*(arr[0]-1))/2;
            c=c+m;
        }
        for(int i=1; i<=29; i++){
            long y = (arr[i]* arr[60-i]);
            c=c+y;
        }
        if(arr[30]>=2){
            long m = (arr[30]*(arr[30]-1))/2;
            c=c+m;
        }
        return (int)c;
        
    }
}