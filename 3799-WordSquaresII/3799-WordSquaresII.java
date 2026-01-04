// Last updated: 1/4/2026, 12:39:47 PM
1class Solution {
2    public List<List<String>> wordSquares(String[] words) {
3        List<List<String>> st = new ArrayList<>();
4        for(int t=0; t<words.length; t++){
5            for(int l=0; l<words.length; l++){
6                if(t!=l && words[t].charAt(0)==words[l].charAt(0)){
7                    for(int r = 0; r<words.length; r++){
8                        if(r!=t && r!=l && words[t].charAt(3)==words[r].charAt(0)){
9                            for(int b=0; b<words.length; b++){
10                                if(b!=t && b!=r && b!=l && words[b].charAt(3)==words[r].charAt(3) && words[l].charAt(3)==words[b].charAt(0)){
11                                    List<String> li = new ArrayList<>();
12                                    li.add(words[t]);
13                                    li.add(words[l]);
14                                    li.add(words[r]);
15                                    li.add(words[b]);
16                                    st.add(li);
17                                }
18                            }
19                        }
20                        
21                    }
22                }
23
24            }
25        }
26        Collections.sort(st, (a, b) -> {
27            for (int i = 0; i < 4; i++) {
28                int cmp = a.get(i).compareTo(b.get(i));
29                if (cmp != 0) return cmp;
30            }
31            return 0;
32        });
33        return st;
34        
35    }
36}