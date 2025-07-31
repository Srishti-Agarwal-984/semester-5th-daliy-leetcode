// Last updated: 7/31/2025, 5:30:26 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int a[], k=0;
        a = new int[gain.length+1];
        a[0] = 0;
        for(int i=0; i<gain.length; i=i+1){
            a[i+1]=a[i]+gain[i];
            if(a[i+1]>k){
                k=a[i+1];
            }
        }
        
        return k;
        
    }
}