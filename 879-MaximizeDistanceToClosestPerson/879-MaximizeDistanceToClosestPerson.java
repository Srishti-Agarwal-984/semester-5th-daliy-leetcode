// Last updated: 7/31/2025, 5:32:50 PM
class Solution {
    public int maxDistToClosest(int[] seats) {
        int l=0, m=0, i=0;
        int p=0;
        for(i =0; i<seats.length; i++){
            if(seats[i]==0){
                m++;
            }
            else{
                if(l<m){
                    // System.out.println(l);
                    l=m;
                    // k=i-1;
                    // s=i-m;
                    if(i-m==0){
                        p=l;
                        // System.out.println(p);
                    }
                    // System.out.println(l);
                }
                m=0;
            }
        }
        if(l<m){
            l=m;
            // k=i-1;
            // s=i-m;
        }
        
        
        // System.out.println(p);
        l=(l+1)/2;
        l=Math.max(m,l);
        // System.out.println(p);
        l=Math.max(p,l);
        // System.out.println(p);
        return l;
        
    }
}