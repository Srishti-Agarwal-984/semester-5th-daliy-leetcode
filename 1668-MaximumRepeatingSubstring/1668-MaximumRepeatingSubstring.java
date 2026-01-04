// Last updated: 1/4/2026, 9:16:34 PM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int n = word.length();
4        int cnt = 0;
5        String temp = "";
6        while(true){
7            temp += word;
8            if(sequence.contains(temp)){
9                cnt++;
10            }
11            else{
12                break;
13            }
14        }
15        return cnt;
16        
17    }
18}