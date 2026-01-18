// Last updated: 1/18/2026, 4:55:52 PM
1class Solution {
2    public long maxTotal(int[] value, int[] limit) {
3        Map<Integer, Integer> map = new HashMap<>();
4        Pair[] p = new Pair[value.length];
5        for(int i=0; i<value.length; i++){
6            p[i] = new Pair(limit[i], value[i]);
7        }
8        Arrays.sort(p, (a, b)->a.l==b.l?b.val-a.val: a.l-b.l);
9        long ans=0;
10        for(int i=0; i<value.length; i++){
11            map.put(p[i].l, map.getOrDefault(p[i].l, 0)+1);
12                if(map.get(p[i].l)>p[i].l){
13                    continue;
14                }
15                ans+=p[i].val;
16
17        }
18        return ans;
19        
20    }
21    class Pair{
22        int l;
23        int val;
24        public Pair(int l, int val){
25            this.l = l;
26            this.val  = val;
27        }
28    }
29}