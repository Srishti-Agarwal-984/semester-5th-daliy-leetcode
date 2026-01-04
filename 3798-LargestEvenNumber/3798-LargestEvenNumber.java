// Last updated: 1/4/2026, 12:23:36 PM
1class Solution {
2    public String largestEven(String s) {
3        for(int i=s.length()-1; i>=0; i--){
4            if(s.charAt(i)=='2'){
5                return s.substring(0, i+1);
6            }
7        }
8        return "";
9        
10    }
11}