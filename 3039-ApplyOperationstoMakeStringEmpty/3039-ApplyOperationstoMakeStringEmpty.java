// Last updated: 1/9/2026, 7:44:16 PM
1class Solution {
2    public String lastNonEmptyString(String s) {
3        TreeSet<Integer> st  = new TreeSet<>();
4
5        int[] freq = new int[26];
6        int max =0;
7        int[] p = new int[26];
8        Arrays.fill(p, -1);
9        for(int i=0; i<s.length(); i++){
10            freq[s.charAt(i)-'a']++;
11            max = Math.max(max, freq[s.charAt(i)-'a']);
12            p[s.charAt(i)-'a'] = i;
13        }
14        for(int i=0; i<26; i++){
15            if(freq[i]==max){
16                st.add(p[i]);
17            }
18        }
19        StringBuilder sb = new StringBuilder();
20        for(int i: st){
21            sb.append(s.charAt(i));
22        }
23        return sb.toString();
24    }
25}