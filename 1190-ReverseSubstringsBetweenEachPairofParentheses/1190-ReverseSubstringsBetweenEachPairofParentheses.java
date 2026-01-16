// Last updated: 1/16/2026, 3:00:09 PM
1class Solution {
2            int i=0;
3    public String reverseParentheses(String s) {
4        
5        StringBuilder sb = new StringBuilder();
6        while(i<s.length() && s.charAt(i)!=')'){
7            if(s.charAt(i)=='('){
8                i++;
9                StringBuilder w = new StringBuilder(reverseParentheses(s));
10                w.reverse();
11                sb.append(w);
12                i++;
13            }
14            else{
15                sb.append(s.charAt(i));
16                i++;
17                
18            }
19        }
20        return sb.toString();
21        
22    }
23}