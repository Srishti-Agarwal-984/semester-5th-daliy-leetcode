// Last updated: 11/16/2025, 8:55:39 AM
class Solution {
    public long countDistinct(long n) {
        String q= String.valueOf(n);
        long a = q.length();
        long u = 0;
        for(int i=1; i<a; i++){
            u+=(long)(Math.pow(9,i));
        }
        for(int i=0; i<a; i++){
            int r=q.charAt(i)-'0';
            for(int j=1; j<r; j++){
                u+=Math.pow(9, a-i-1);
            }
            if(r==0){
                break;
            }
            if(i==a-1){
                u++;
            }
            
        }
        
        return u;
    }
}