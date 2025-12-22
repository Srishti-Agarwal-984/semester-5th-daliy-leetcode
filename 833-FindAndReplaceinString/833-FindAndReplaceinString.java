// Last updated: 12/23/2025, 12:19:52 AM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int[] s1  = new int[s.length()];
4        String[] s2 = new String[s.length()];
5        for(int i=0; i<s2.length; i++){
6            s2[i]="";
7
8        }
9        for(int i=0; i<indices.length; i++){
10            if(s.substring(indices[i]).indexOf(sources[i])==0){
11                s2[indices[i]] = targets[i];
12                for(int i1=indices[i]; i1<indices[i]+sources[i].length(); i1++){
13                    s1[i1]++;
14                }
15            }
16        }
17        StringBuilder sb = new StringBuilder();
18        for(int i=0; i<s.length(); i++){
19            if(s1[i]==0){
20                sb.append(s.charAt(i));
21            }
22            else{
23                sb.append(s2[i]);
24            }
25
26        }
27        return sb.toString();
28        
29    }
30}