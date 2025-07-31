// Last updated: 7/31/2025, 5:25:37 PM
class Solution {
    public String concatHex36(int n) {
        int k = n*n;
        int l = k*n;
        //System.out.println(l);
        StringBuilder st = new StringBuilder();
        while(k!=0){
            int u = k%16;
            if(u>=10){
                st.append(""+(char)('A'+u-10));
            }
            else{
                st.append(String.valueOf(u));
            }
            k=k/16;
        }
        // System.out.println(st);
        st.reverse();
        StringBuilder st1 = new StringBuilder();
        while(l!=0){
            int u = l%36;
            if(u>=10){
                //System.out.println((char)('A'+u-10));
                st1.append(""+(char)('A'+u-10));
            }
            else{
                st1.append(String.valueOf(u));
            }
            l=l/36;
        }
        //System.out.println(st1);
        st1.reverse();
        return st.toString() + st1.toString();
        
    }
}