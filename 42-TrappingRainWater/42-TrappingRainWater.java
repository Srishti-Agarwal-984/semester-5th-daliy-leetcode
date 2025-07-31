// Last updated: 7/31/2025, 5:38:11 PM
class Solution {
    public int trap(int[] height) {
        return trapping(height);
     
    }
    public static int trapping(int[] arr){
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int s=0;
        for(int i=0; i<n; i++){
            s=s+Math.min(left[i],right[i])-arr[i];
        }
        return s;
    }

    
    
}