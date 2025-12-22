// Last updated: 12/22/2025, 4:29:03 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        String ans="";
4        int maxlen=0;
5        for(int i=0;i<s.length();i++){
6            for(int j=i;j<s.length();j++){
7                String sub=s.substring(i,j+1);
8                if(niceString(s.substring(i,j+1))){
9                    int len=sub.length();
10                    if(len>maxlen){
11                        maxlen=len;
12                        ans=sub;
13                    }
14                }
15                
16            }
17        }
18        return ans;
19    }
20    public static boolean niceString(String s){
21        HashSet<Character> set=new HashSet<>();
22        int n=s.length();
23        for(int i=0;i<n;i++){
24            set.add(s.charAt(i));
25        }
26        for(int i=0;i<n;i++){
27            if(Character.isLowerCase(s.charAt(i)) && !set.contains(Character.toUpperCase(s.charAt(i)))){
28                return false;
29            }
30            if(Character.isUpperCase(s.charAt(i)) && !set.contains(Character.toLowerCase(s.charAt(i)))){
31                return false;
32            }
33        }
34        return true;
35    }
36
37}