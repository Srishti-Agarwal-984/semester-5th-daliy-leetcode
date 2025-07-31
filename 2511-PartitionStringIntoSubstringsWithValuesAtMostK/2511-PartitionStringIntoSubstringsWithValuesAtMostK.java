// Last updated: 7/31/2025, 5:28:34 PM
class Solution {
    public int minimumPartition(String s, int k) {
        int c=0;
        int i=0;
        String q = "";
        while(i<s.length()){
            q+=s.charAt(i);
            int u=0;
            
            if(Long.parseLong(q)>k){
                q=""+s.charAt(i);
                if(Long.parseLong(q)>k && q.length()>=1){
                    return -1;
                }
                c++;
            }
            i++;
        }
        return c+1;
    }
}