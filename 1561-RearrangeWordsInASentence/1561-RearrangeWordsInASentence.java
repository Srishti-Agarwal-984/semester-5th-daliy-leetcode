// Last updated: 7/31/2025, 5:30:54 PM
class Solution {
    public String arrangeWords(String s) {
        List<Integer> ui = new ArrayList<>();
        List<Integer> si = new ArrayList<>();
        List<String> us = new ArrayList<>();
        String l ="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                l+=s.charAt(i);
            }
            else{
                ui.add(l.length());
                si.add(l.length());
                us.add(l);
                l="";
            }

        }
        ui.add(l.length());
        si.add(l.length());
        us.add(l);
        l="";
        Collections.sort(si);
        for(int i=0; i<si.size(); i++){
            int idx = ui.indexOf(si.get(i));
            String kl = us.get(idx);
            if(i==0){
                if(kl.charAt(0)-'a'>=0 && kl.charAt(0)-'a'<26){
                    char gh = (char)(kl.charAt(0)-'a'+'A');
                    kl= gh+kl.substring(1);
                }
                l=l+kl+" ";
            }
            else{
                if(kl.charAt(0)-'A'>=0 && kl.charAt(0)-'A'<26){
                    char gh = (char)(kl.charAt(0)-'A'+'a');
                    kl= gh+kl.substring(1);
                }
                l=l+kl+" ";
            }
            ui.remove(idx);
            us.remove(idx);
        }
        return l.substring(0, l.length()-1);
        
    }
}
