// Last updated: 11/14/2025, 9:06:27 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                return i-1;
            }
            
        }
        return arr.length-1;

    }
}