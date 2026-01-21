// Last updated: 1/21/2026, 11:46:16 PM
1class Solution {
2    public int largestVariance(String s) {
3        int[] freq = new int[26];
4        for(int i=0; i<s.length(); i++){
5            freq[s.charAt(i)-'a']++;
6        }
7        int ans=0;
8        for(int i='a'; i<='z'; i++){
9            if(freq[i-'a']==0){
10                    continue;
11                }
12            for(int j='a'; j<='z'; j++){
13                boolean prev = false;
14                int first=0, sec=0;
15                if(freq[j-'a']==0){
16                    continue;
17                }
18                for(int k=0; k<s.length(); k++){
19                    if(s.charAt(k)==i){
20                        first++;
21                    }
22                    if(s.charAt(k)==j){
23                        sec++;
24                    }
25                    if(sec>0){
26                        ans  = Math.max(ans, first-sec);
27                    }
28                    else{
29                        if(prev){
30                            ans = Math.max(ans, first-1);
31                        }
32                    }
33                    if(sec>first){
34                        sec=0;
35                        first=0;
36                        prev=true;
37                    }
38
39                }
40            }
41        }
42        return ans;
43    }
44}