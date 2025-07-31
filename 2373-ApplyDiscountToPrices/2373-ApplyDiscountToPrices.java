// Last updated: 7/31/2025, 5:29:03 PM
class Solution {
    public String discountPrices(String s, int d) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(((i!=0 && s.charAt(i-1)==' ')|| i==0) && s.charAt(i)=='$' && i!=s.length()-1 && s.charAt(i+1)-'0'>=0 && s.charAt(i+1)-'0'<=9){
                sb.append(""+s.charAt(i));
                int u=i;
                i++;
                double r = 0;
                while(i<s.length() && s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                    r=r*10+s.charAt(i)-'0';
                    i++;
                }
                if(i!=s.length() && s.charAt(i)!=' '){
                    i=u;
                    continue;
                }
                r=r-(r*d)/100;
                String f = String.format("%.2f", r);
                
                sb.append(f);
                i--;

            }
            else{
                sb.append(""+s.charAt(i));
            }

        }
        return sb.toString();
    }
}