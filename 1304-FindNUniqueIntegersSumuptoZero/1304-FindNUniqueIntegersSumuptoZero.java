// Last updated: 9/9/2025, 5:32:13 AM
class Solution {
    public int[] sumZero(int n) {
        if(n%2!=0){
            int[] arr = new int[n];
            int a=(n-1)/2;
            int b=-a;
            for(int i=0; i<n; i++){
                arr[i]=b;
                b++;
            }
            return arr;
        }
        int[] arr = new int[n];
        int a=(n)/2;
        int b=-a;
        for(int i=0; i<n; i++){
            if(b==0){
                b++;
            }
            arr[i]=b;
            b++;
        }
        return arr;
        
    }
}