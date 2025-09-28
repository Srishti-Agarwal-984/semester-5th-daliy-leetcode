// Last updated: 9/28/2025, 1:44:24 PM
class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] a=new int[k];
        for(int i=0; i<arr.length; i++){
            int a1 =arr[i]%k;
            if(arr[i]<0){
                a1=(k-Math.abs(arr[i])%k)%k;
            }
            a[a1]++;
        }
        if(a[0]%2!=0){
            return false;
        }
        for(int i=1; i<k; i++){
            if(a[i]!=a[k-i]){
                return false;
            }
        
        }
        return true;

        
    }
}