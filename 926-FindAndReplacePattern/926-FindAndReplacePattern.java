// Last updated: 7/31/2025, 5:32:43 PM
class Solution {
    public List<String> findAndReplacePattern(String[] words, String p) {
        List<String> ans = new ArrayList<>();
        List<Integer> s1 = new ArrayList<>();
        int c1=1;
        boolean[] ch = new boolean[p.length()];
        for (int j = 0; j < p.length(); j++) {
            if(ch[j]){
                continue;
            }
            s1.add(j);
            ch[j]=true;
            for(int i=j+1; i<p.length(); i++){
                if(p.charAt(j)==p.charAt(i)){
                    ch[i]=true;
                    s1.add(j);
                }
            }

        }
        s1.add(c1);
        List<List<Integer>> st = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            List<Integer> s = new ArrayList<>();
            ch = new boolean[p.length()];
            for (int j = 0; j < words[i].length(); j++) {
                if(ch[j]){
                    continue;
                }
                s.add(j);
                ch[j]=true;
                for(int i1=j+1; i1<p.length(); i1++){
                    if(words[i].charAt(j)==words[i].charAt(i1)){
                        ch[i1]=true;
                        s.add(j);
                    }


                }

            }
            st.add(s);
        }
        for (int i = 0; i < words.length; i++) {
            if(helper(s1,st.get(i))){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean helper(List<Integer> s1,List<Integer> cmp){
        for(int i=0; i<cmp.size(); i++){
            if(s1.get(i)!=cmp.get(i)){
                return false;
            }
        }
        return true;

    }
}