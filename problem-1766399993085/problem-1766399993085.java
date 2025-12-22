// Last updated: 12/22/2025, 4:09:53 PM
1class Solution {
2    public int minimumSwap(String s1, String s2) {
3        int p = 0, s1x=0, s1y=0, s2x=0, s2y=0;
4        for(int i=0; i<s1.length(); i++){
5            if(s1.charAt(i)!=s2.charAt(i)){
6                p++;
7                if(s1.charAt(i)=='x'){
8                    s1x++;
9                }
10                else{
11                    s1y++;
12                }
13            }
14        }
15        int ans = s1x/2;
16        ans+=s1y/2;
17        ans+=s1y%2+s1x%2;
18        if(p%2!=0){
19            return -1;
20
21        }
22        return ans;
23
24        
25    }
26}