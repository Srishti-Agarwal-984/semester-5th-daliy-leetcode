// Last updated: 1/1/2026, 7:05:55 PM
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int idd, int level) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<friends.length; i++){
5            map.put(i, new HashSet<>());
6            for(int j=0; j<friends[i].length; j++){
7                map.get(i).add(friends[i][j]);
8            }
9        }
10       // int p = 0;
11        Queue<Pair> pq = new LinkedList<>();
12        pq.add(new Pair(idd, 0));
13        HashMap<String , Integer> freq = new HashMap<>();
14        HashSet<Integer> vi= new HashSet<>();
15        while(!pq.isEmpty()){
16            Pair e = pq.poll();
17            if(vi.contains(e.id)){
18                continue;
19            }
20            vi.add(e.id);
21            if(e.l == level){
22                for(String s:  watchedVideos.get(e.id)){
23                    freq.put(s, freq.getOrDefault(s, 0)+1);
24                }
25            }
26            if(e.l+1>level){
27                continue;
28            }
29            for(int q: map.get(e.id)){
30                if(!vi.contains(q)){
31                    pq.add(new Pair(q, e.l+1));
32                }
33            }
34        }
35        List<P> li = new ArrayList<>();
36        for(String df: freq.keySet()){
37            li.add(new P(df, freq.get(df)));
38        }
39        Collections.sort(li, new Comparator<>(){
40            @Override
41            public int compare(P p1, P p2){
42                if(p1.f == p2.f){
43                    return p1.s.compareTo(p2.s);
44                }
45                return p1.f-p2.f;
46            }
47        });
48        List<String> ans = new ArrayList<>();
49        for(P df: li){
50            ans.add(df.s);
51        }
52        return ans;
53
54
55        
56    }
57    class Pair{
58        int id;
59        int l;
60        public Pair(int id, int l){
61            this.id = id;
62            this.l = l;
63        }
64    }
65    class P{
66        String s;
67        int f;
68        public P(String s, int f){
69            this.s = s;
70            this.f = f;
71        }
72    }
73}