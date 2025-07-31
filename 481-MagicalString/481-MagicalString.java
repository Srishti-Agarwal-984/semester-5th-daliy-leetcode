// Last updated: 7/31/2025, 5:34:16 PM
class Solution {
    public int magicalString(int n) {
        StringBuilder fg = new StringBuilder();
        fg.append("122");
        int turn =1;
        int idx=2;
        String q = "11", r="1",s="22",t="2"; 
        while(fg.length()<=n){
            int l = fg.charAt(idx)-'0';
            idx++;
            if(l==1 && turn ==2){
                fg.append(t);
            }
            else if(l==1 && turn ==1){
                fg.append(r);
            }
            else if(l==2 && turn ==1){
                fg.append(q);
            } 
            else{
                fg.append(s);
            }
            turn =turn==1?2 :1;
        }
        System.out.print(fg);
        int c=0;
        for(int i=0; i<n; i++){
            if(fg.charAt(i)=='1'){
                c++;
            }

        }
        return c;
    }
}