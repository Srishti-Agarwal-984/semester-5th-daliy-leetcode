// Last updated: 1/18/2026, 9:56:44 PM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int c=0;
4        int v=0;
5        for(int i=0; i<s.length(); i++){
6            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
7                if("aeiou".indexOf(s.charAt(i))>=0){
8                    v++;
9                }
10                else{
11                    c++;
12                }
13            }
14        }
15        return c>0 ? (int)Math.floor(v/c):0;
16        
17    }
18}