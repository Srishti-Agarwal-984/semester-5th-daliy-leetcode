// Last updated: 12/21/2025, 8:43:50 AM
1class Solution {
2    public long minCost(String s, int[] cost) {
3        long[] freq = new long[26];
4        for(int i=0; i<s.length(); i++){
5            freq[s.charAt(i)-'a']+=cost[i];
6        }
7        List<Long> li = new ArrayList<>();
8        for(int i=0; i<26; i++){
9            if(freq[i]!=0){
10                li.add(freq[i]);
11            }
12        }
13        Collections.sort(li);
14        long ans=0;
15        for(int i=0; i<li.size()-1; i++){
16            ans+=li.get(i);
17        }
18        return ans;
19        
20    }
21}