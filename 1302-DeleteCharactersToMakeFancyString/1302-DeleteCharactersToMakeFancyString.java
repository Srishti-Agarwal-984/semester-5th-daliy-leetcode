// Last updated: 7/31/2025, 5:31:44 PM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder d = new StringBuilder();
        int  f= s.length()-1;
        if(f<=1){
            return s;
        }
        for(int i=0; i<s.length()-2; i++){
            char q= s.charAt(i);
            char v= s.charAt(i+1);
            char w= s.charAt(i+2);
            if(q==v && q==w){
                continue;
            }
            else{
                d.append(q);
            }

        }
        // int f= s.length()-1;
        d.append(s.charAt(f-1));
        d.append(s.charAt(f));

        return d.toString();
        
    }
}