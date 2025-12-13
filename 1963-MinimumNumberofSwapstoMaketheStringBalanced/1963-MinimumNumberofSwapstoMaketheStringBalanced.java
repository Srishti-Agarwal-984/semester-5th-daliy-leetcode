// Last updated: 12/13/2025, 6:48:17 AM
1class Solution {
2    public int minSwaps(String s) {
3        int cl=0;
4        int op=0;
5        Stack<Integer> st = new Stack<>();
6        for(int i=0; i<s.length(); i++){
7            if(!st.isEmpty() &&  s.charAt(i)==']'){
8                st.pop();
9            }
10            else if(s.charAt(i)=='['){
11                st.add(i);
12            }
13            else if(st.isEmpty() && s.charAt(i)==']'){
14                cl++;
15            }
16        }
17        return (cl+1)/2;
18    }
19}