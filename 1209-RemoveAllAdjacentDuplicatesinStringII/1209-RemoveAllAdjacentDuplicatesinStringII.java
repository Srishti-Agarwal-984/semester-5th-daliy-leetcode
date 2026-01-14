// Last updated: 1/14/2026, 10:49:48 PM
1class Solution {
2    public String removeDuplicates(String s, int k) {
3        Stack<Pair> st = new Stack<>();
4        for(int i=0; i<s.length(); i++){
5            if(!st.isEmpty() && st.peek().ch==s.charAt(i)){
6                Pair p = st.pop();
7                p.val=p.val+1;
8                if(p.val<k){
9                    st.add(new Pair(p.ch, p.val));
10                }
11            }
12            else{
13                st.add(new Pair(s.charAt(i), 1));
14            }
15        }
16        StringBuilder sb = new StringBuilder();
17        while(!st.isEmpty()){
18            Pair p = st.pop();
19            int df = p.val;
20            while(df-->0){
21                sb.append(p.ch);
22            }
23        }
24        sb.reverse();
25        return sb.toString();
26        
27        
28    }
29    class Pair{
30        char ch;
31        int val;
32        public Pair(char ch, int val){
33            this.ch = ch;
34            this.val = val;
35        }
36    }
37}