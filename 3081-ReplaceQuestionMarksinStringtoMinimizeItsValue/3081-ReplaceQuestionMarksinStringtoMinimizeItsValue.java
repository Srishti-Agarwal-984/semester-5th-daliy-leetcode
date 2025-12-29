// Last updated: 12/29/2025, 6:05:37 PM
1class Solution {
2    public String minimizeStringValue(String s) {
3        int[] freq = new int[27];
4        for(int i=0; i<s.length(); i++){
5            if(s.charAt(i)!='?'){
6                freq[s.charAt(i)-'a']++;
7            }
8            else{
9                freq[26]++;
10            }
11        }
12        StringBuilder sb = new StringBuilder();
13        TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
14        map.put(0,new TreeSet<>());
15        for(int i=0; i<26; i++){
16            if(!map.containsKey(freq[i])){
17                map.put(freq[i], new TreeSet<>());
18            }
19            map.get(freq[i]).add(i);
20        }
21        if(freq[26]==0){
22            return s;
23        }
24        int a = freq[26];
25        int[] need = new int[26];
26
27         while(a>0){
28            int min = Integer.MAX_VALUE;
29            for(int i=0; i<26; i++){
30                min = Math.min(min, freq[i]);
31            }
32            for(int i=0; i<26; i++){
33                if(freq[i]==min){
34                    need[i]++;
35                    freq[i]++;
36                    a--;
37                }
38                if(a==0){
39                    break;
40                }
41            }
42         }
43        for(int i=0; i<s.length(); i++){
44            if(s.charAt(i)!='?'){
45                sb.append(s.charAt(i));
46            }
47            else{
48                for(int i1=0; i1<26; i1++){
49                    //System.out.println((char)(i1+'a'));
50                    if(need[i1]>0){
51                        sb.append((char)(i1+'a'));
52                        need[i1]--;
53                        break;
54                    }
55
56                }
57                
58            }
59        }
60        return sb.toString();
61        
62        
63    }
64}