// Last updated: 7/31/2025, 5:32:45 PM
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa= 0;
        Arrays.sort(aliceSizes);
        for(int i=0; i<aliceSizes.length; i++){
            sa=sa+aliceSizes[i];
        }
        // sa=sa-1;
        int sb=0;
        for(int i=0; i<bobSizes.length; i++){
            sb=sb+bobSizes[i];
        }
        // int total = (sa-sb)/2;
        int [] a= new int[2];
        for(int i=0; i<bobSizes.length; i++){
            int u = (sa-sb)/2 + bobSizes[i];
            int h=0, m = aliceSizes.length-1, l=0;
            while(h<=m){
                int mid = h+(m-h)/2;
                if(aliceSizes[mid]==u){
                    a[0]=u;
                    l=1;
                    break;
                }
                else if(aliceSizes[mid]>u){
                    m=mid-1;

                }
                else{
                    h=mid+1;
                }
            }
            if(l==1){
                a[1] = bobSizes[i];
                break;
            }
        }
        
        return a;
        
        
    }
}