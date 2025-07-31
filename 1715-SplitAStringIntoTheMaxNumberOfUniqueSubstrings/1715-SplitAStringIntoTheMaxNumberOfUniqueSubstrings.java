// Last updated: 7/31/2025, 5:30:36 PM
class Solution {
    static int r=0;
    public int maxUniqueSplit(String s) {
        List<String> st = new ArrayList<>();
        helper(s,st);
        int g=r;
        r=0;
        return g;
    }
    public static void helper(String s, List<String> st){
        if(s.length()==0){
            r=Math.max(r,new ArrayList<>(st).size());
            return;
        }
        for(int i=1; i<s.length()+1; i++){
            String p = s.substring(0,i);
            if(st.indexOf(p)<0){
                st.add(p);
                helper(s.substring(i),st);
                st.remove(st.size()-1);
            }
        }
    }
    // public static boolean fun(List<String> st, String p){
    //     int si=0, en=st.size()-1;
    //     while(si<=en){
    //         if(p.equals(st.get(si)) || p.equals(st.get(en))){
    //             return true;
    //         }
    //         si++;
    //         en--;

    //     }
    //     return false;

    // }
}