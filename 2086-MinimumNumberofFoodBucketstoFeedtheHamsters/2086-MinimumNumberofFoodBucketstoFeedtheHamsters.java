// Last updated: 1/5/2026, 1:07:08 PM
1class Solution {
2    public int minimumBuckets(String hamsters) {
3        
4        
5        char[] ch = new char[hamsters.length()];
6        for(int i=0; i<hamsters.length(); i++){
7            ch[i] = hamsters.charAt(i);
8        }
9        int r=0;
10        int h=0;
11        for(int i=0; i<hamsters.length(); i++){
12            if(ch[i]=='H'){
13                if(i>0 && ch[i-1]=='F'){
14                    continue;
15                }
16                else if(i<hamsters.length()-1 && ch[i+1]=='.'){
17                    r++;
18                    ch[i+1]='F';
19                    continue;
20                }
21                else if(i>0 && ch[i-1]=='.'){
22                    ch[i-1]='F';
23                    r++;
24                    continue;
25                }
26                return -1;
27
28                
29                
30            }
31        }
32        return r;
33
34    }
35}