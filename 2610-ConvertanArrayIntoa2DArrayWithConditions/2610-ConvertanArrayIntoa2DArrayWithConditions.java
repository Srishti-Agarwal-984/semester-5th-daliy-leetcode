// Last updated: 11/29/2025, 5:19:01 PM
1class Solution {
2    public List<List<Integer>> findMatrix(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        List<List<Integer>> li = new ArrayList<>();
5        for(int el: nums){
6            map.put(el, map.getOrDefault(el, 0)+1);
7        }
8        
9        while(map.size()>0){
10            List<Integer> l = new ArrayList<>();
11            int c=0;
12            for(int k:map.keySet()){
13                
14                if(map.get(k)>0){
15                    l.add(k);
16                    map.put(k, map.get(k)-1);
17                    c++;
18                }
19
20            }
21
22            
23            if(l.size()==0){
24                break;
25            }
26            li.add(l);
27
28        }
29        return li;
30
31
32        
33    }
34}