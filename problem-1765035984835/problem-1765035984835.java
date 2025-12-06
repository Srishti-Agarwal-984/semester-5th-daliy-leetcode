// Last updated: 12/6/2025, 9:16:24 PM
1class Solution {
2    public long maxPoints(int[] technique1, int[] technique2, int k) {
3        long ans =0;
4        for(int i=0; i<technique1.length; i++){
5            if(technique1[i]>=technique2[i]){
6                k--;
7                ans+=technique1[i];
8                technique1[i]=0;
9                technique2[i]=0;
10            }
11        }
12        HashSet<Integer> st = new HashSet<>();
13        List<Pair> li = new ArrayList<>();
14        for(int i=0; i<technique1.length; i++){
15            if(technique1[i]!=0){
16                li.add(new Pair(i, Math.abs(technique1[i]-technique2[i])));
17            }
18        }
19        Collections.sort(li, new Comparator<>(){
20            @Override
21            public int compare(Pair p1, Pair p2){
22                return p1.diff-p2.diff;
23            }
24        });
25        int u=0;
26        while(k-->0){
27            
28            ans=ans+technique1[li.get(u).i];
29            technique1[li.get(u).i]=0;
30            u++;
31        }
32        for(int i=0; i<technique1.length; i++){
33            if(technique1[i]!=0){
34                ans+=technique2[i];
35            }
36        }
37        return ans;
38        
39        
40    }
41    class Pair{
42        int i;
43        int diff;
44        public Pair(int i, int diff){
45            this.i=i;
46            this.diff = diff;
47            
48        }
49    }
50}