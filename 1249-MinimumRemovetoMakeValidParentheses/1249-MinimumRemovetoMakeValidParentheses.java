// Last updated: 1/17/2026, 7:09:31 PM
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        int op=0; int cl=0;
4        int i=0; 
5        Stack<Integer> st = new Stack<>();
6        Stack<Integer> kl = new Stack<>();
7        while(i<s.length()){
8            if(s.charAt(i)==')'){
9                if(st.isEmpty()){
10                    kl.add(i);
11                }
12                else{
13                    st.pop();
14                }
15            }
16            else if(s.charAt(i)=='('){
17                st.add(i);
18            }
19            i++;
20        }
21        StringBuilder sb = new StringBuilder();
22        for(i= s.length()-1; i>=0; i--){
23            if(!st.isEmpty() && st.peek()==i){
24                st.pop();
25                continue;
26            }
27            if(!kl.isEmpty() && kl.peek()==i){
28                kl.pop();
29                continue;
30            }
31            sb.append(s.charAt(i));
32        }
33        sb.reverse();
34        return sb.toString();
35        
36        
37    }
38}