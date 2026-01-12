// Last updated: 1/12/2026, 3:27:31 PM
1class Solution {
2    public int residuePrefixes(String s) {
3        HashSet<Integer> st = new HashSet<>();
4        int c=0;
5        for(int i=0; i<s.length(); i++){
6            st.add(s.charAt(i)-'a');
7            if(st.size()==(i+1)%3){
8                c++;
9            }
10        
11        }
12        return c;
13    }
14}