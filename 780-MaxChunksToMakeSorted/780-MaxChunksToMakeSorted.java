// Last updated: 7/31/2025, 5:33:11 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        long sum=0;
        int d=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            long a = (i*(i+1))/2;
            if(a==sum){
                d++;
            }
        }
        return d;
        
    }
}