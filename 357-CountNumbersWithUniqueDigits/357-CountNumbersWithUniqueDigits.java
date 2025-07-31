// Last updated: 7/31/2025, 5:35:00 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int[] arr= new int[n+1];
        arr[0]=1;
        comb(arr,n);
        int sum=0;
        for(int i=0; i<n+1; i++){
            sum=sum+arr[i];
            // System.out.println(arr[i]);
        }
        return sum;




    }
    public static void comb(int[] arr, int n){
        if(n==1){
            arr[n]=9;
            //System.out.println(arr[n])
            return;
        }
        comb(arr,n-1);
        arr[n]=arr[n-1]*(10-n+1);
    }
        
        
    
}