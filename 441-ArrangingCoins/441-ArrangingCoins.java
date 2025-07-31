// Last updated: 7/31/2025, 5:34:30 PM
class Solution {
    public int arrangeCoins(int n) {
        int c=0, l=1;
//         while(n>0){
//             n=n-l;
//             if(n>=0){
//                 c++;
//             }
//             l++;
            
//         }
        return (int)((Math.sqrt(1 + 8L * (long)n) - 1) / 2);
        
    }
}