// Last updated: 1/21/2026, 10:42:19 PM
1class Solution {
2    public int numSimilarGroups(String[] strs) {
3        HashMap<Integer, HashSet<Integer>>map = new HashMap<>();
4        for(int i=0; i<strs.length; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int i=0; i<strs.length; i++){
8            for(int j=i+1; j<strs.length; j++){
9                int c=0;
10                for(int u=0; u<strs[i].length(); u++){
11                    if(strs[i].charAt(u)!=strs[j].charAt(u)){
12                        c++;
13                    }
14                    if(c>3){
15                        break;
16                    }
17                }
18                if(c<=2){
19                    map.get(i).add(j);
20                    map.get(j).add(i);
21                }
22            }
23        }
24        int ans=0;
25        HashSet<Integer> vi=  new HashSet<>();
26        for(int i=0; i<strs.length; i++){
27            if(vi.contains(i)){
28                continue;
29            }
30            Queue<Integer> q = new LinkedList<>();
31            q.add(i);
32            while(!q.isEmpty()){
33                int w = q.poll();
34                if(vi.contains(w)){
35                    continue;
36                }
37                vi.add(w);
38                for(int nbrs: map.get(w)){
39                    if(!vi.contains(nbrs)){
40                        q.add(nbrs);
41                    }
42                }
43            }
44            ans++;
45        }
46        return ans;
47    }
48}