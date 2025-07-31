// Last updated: 7/31/2025, 5:35:25 PM
class Solution {
    public int hIndex(int[] citations) {
        // Arrays.sort(citations);
        
        int c=0,  ans=0, b = citations.length;
        while(c<=b){
            int mid = c+(b-c)/2;
            if(ad(citations, mid)){
                ans=Math.max(mid, ans);
                c=mid+1;
            }
            else{
                b=mid-1;
            }
            // c++;
  
        }
        return ans;
        
        
    }
    public static boolean ad(int[] citations, int mide){
        int i=0, j=citations.length-1;
        int a=0;
        while(i<=j){
            int mid1 = i+(j-i)/2;
            if(citations[mid1]>=mide){
                a = citations.length-mid1;
                j=mid1-1;
                if(a>=mide){
                    return true;
                    
                }
                    
            }
            else{
                i=mid1+1;
            }
            // i++;
        }
        return false;
        
    }
}