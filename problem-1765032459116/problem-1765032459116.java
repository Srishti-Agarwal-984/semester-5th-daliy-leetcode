// Last updated: 12/6/2025, 8:17:39 PM
1class Solution {
2    public boolean completePrime(int num) {
3        String s = String.valueOf(num);
4        boolean ans = false;
5        for(int i=0; i<s.length(); i++){
6            boolean g = helper(s.substring(0, i+1));
7            boolean d = helper(s.substring(i+1));
8            if(g || d){
9                return false;
10            }
11            
12        }
13        return true;
14        
15    }
16    public boolean helper(String p){
17        if(p.length()==0){
18            return false;
19        }
20        
21        int a = Integer.valueOf(p);
22        if(a==1){
23            return true;
24        }
25        for(int i=2; i*i<=a; i++){
26            if(a%i==0){
27                return true;
28            }
29        }
30        return false;
31    }
32}