// Last updated: 7/31/2025, 5:31:11 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            int j= i+1, m= arr.length-1;
            while(j<=m){
                int mid = (j+m)/2;
                if(arr[mid]==arr[i]*2){
                    return true;
                }
                else if(arr[mid]>arr[i]*2){
                    m=mid-1;
                }
                else{
                    j=mid+1;
                }
            }
            j=0;
            m=i-1;
            while(j<=m){
                int mid = (j+m)/2;
                if(arr[mid]==arr[i]*2){
                    return true;
                }
                else if(arr[mid]>arr[i]*2){
                    m=mid-1;
                }
                else{
                    j=mid+1;
                }
            }
        }
        return false;
    }
        
}