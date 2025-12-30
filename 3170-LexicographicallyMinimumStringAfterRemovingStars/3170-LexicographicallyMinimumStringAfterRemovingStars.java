// Last updated: 12/30/2025, 1:19:26 PM
1class Solution {
2    public String clearStars(String s) {
3        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
4            @Override
5            public int compare(Pair p1, Pair p2){
6                if(p1.c == p2.c){
7                    return p2.i-p1.i;
8                }
9                return p1.c-p2.c;
10            }
11        });
12        for(int i=0; i<s.length(); i++){
13            if(s.charAt(i)=='*'){
14                pq.poll();
15            }
16            else{
17                pq.add(new Pair(s.charAt(i), i));
18            }
19        }
20        char[] ch = new char[s.length()];
21        while(!pq.isEmpty()){
22            Pair p = pq.poll();
23            ch[p.i] = p.c;
24
25        }
26        StringBuilder sb = new StringBuilder();
27        for(char c: ch){
28            if (c == '\0') continue;
29            sb.append(c);
30        }
31        return sb.toString();
32        
33        
34    }
35    class Pair{
36        char c;
37        int i;
38        public Pair(char c, int i){
39            this.c  =c;
40            this.i = i;
41        }
42    }
43}