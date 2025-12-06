// Last updated: 12/6/2025, 9:17:01 PM
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
12        List<Pair> li = new ArrayList<>();
13        for(int i=0; i<technique1.length; i++){
14            if(technique1[i]!=0){
15                li.add(new Pair(i, Math.abs(technique1[i]-technique2[i])));
16            }
17        }
18        Collections.sort(li, new Comparator<>(){
19            @Override
20            public int compare(Pair p1, Pair p2){
21                return p1.diff-p2.diff;
22            }
23        });
24        int u=0;
25        while(k-->0){
26            
27            ans=ans+technique1[li.get(u).i];
28            technique1[li.get(u).i]=0;
29            u++;
30        }
31        for(int i=0; i<technique1.length; i++){
32            if(technique1[i]!=0){
33                ans+=technique2[i];
34            }
35        }
36        return ans;
37        
38        
39    }
40    class Pair{
41        int i;
42        int diff;
43        public Pair(int i, int diff){
44            this.i=i;
45            this.diff = diff;
46            
47        }
48    }
49}