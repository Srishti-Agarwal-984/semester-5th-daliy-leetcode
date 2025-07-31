// Last updated: 7/31/2025, 5:27:24 PM
class Solution {
    public long countCompleteDayPairs(int[] hours) {
//         Arrays.sort(hours);
//         long c = 0;
//         for(int i=0; i<hours.length-1; i++){
//             int a = i+1;
//             int b = hours.length-1;
//             int p = b-a;
//             while(a<b){
//                 if((hours[a]+hours[i])%24==0){
//                     c++;
//                 }
//                 if((hours[b]+hours[i])%24==0){
//                     c++;
//                 }
//                 a++;
//                 b--;
//             }
//             if(p%2==0){
//                 if((hours[a]+hours[i])%24==0){
//                     c++;
//                 }
//             }
            
//         }
//         return c;
        long [] arr = new long[24];
        for(int i=0; i<hours.length; i++){
            int d = hours[i]%24;
            arr[d]= arr[d] +1;
        }
        long c =0;
        if(arr[0]>=2){
            long m = (arr[0]*(arr[0]-1))/2;
            c=c+m;
        }
        for(int i=1; i<=11; i++){
            long y = (arr[i]* arr[24-i]);
            c=c+y;
        }
        if(arr[12]>=2){
            long m = (arr[12]*(arr[12]-1))/2;
            c=c+m;
        }
        return c;
        
    }
}