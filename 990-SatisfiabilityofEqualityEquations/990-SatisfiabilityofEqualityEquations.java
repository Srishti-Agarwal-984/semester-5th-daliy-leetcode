// Last updated: 12/23/2025, 12:49:01 AM
1class Solution {
2    public boolean equationsPossible(String[] equations) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<26; i++){
5            map.put(i, new HashSet<>());
6            map.get(i).add(i);
7        }
8        for(String s: equations){
9            if(s.charAt(1)=='!'){
10                continue;
11            }
12            else{
13                map.get(s.charAt(0)-'a').add(s.charAt(3)-'a');
14                map.get(s.charAt(3)-'a').add(s.charAt(0)-'a');
15            }
16        }
17        for(String s: equations){
18            if(s.charAt(1)=='!'){
19                if(map.get(s.charAt(0)-'a').contains(s.charAt(3)-'a')){
20                    return false;
21                }
22                HashSet<Integer> vi = new HashSet<>();
23                Queue<Integer> q = new LinkedList<>();
24                q.add(s.charAt(0)-'a');
25                while(!q.isEmpty()){
26                    int e = q.poll();
27                    if(vi.contains(e)){
28                        continue;
29                    }
30                    vi.add(e);
31                    for(int nbrs: map.get(e)){
32                        if(!vi.contains(nbrs)){
33                            q.add(nbrs);
34                        }
35                    }
36                }
37                if(vi.contains(s.charAt(3)-'a')){
38                    return false;
39                }
40            }
41            
42        }
43
44        return true;
45    }
46}