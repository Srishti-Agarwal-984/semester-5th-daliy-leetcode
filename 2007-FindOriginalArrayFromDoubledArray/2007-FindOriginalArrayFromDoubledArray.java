// Last updated: 2/1/2026, 7:07:45 PM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        if(changed.length%2!=0){
4            return new int[0];
5        }
6        int[] ans = new int[changed.length/2];
7        HashMap<Integer,Integer> map = new HashMap<>();
8        for(int el : changed){
9            map.put(el,map.getOrDefault(el,0)+1);
10        }
11        Arrays.sort(changed);
12        int i = 0;
13        for(int el : changed){
14            if(map.get(el) == 0){
15                continue;
16            }
17            if(el == 0 && map.get(el) % 2 != 0){
18                return new int[]{};
19            }
20            int need = el*2;
21            if(!map.containsKey(need) || map.get(need) == 0){
22                return new int[]{};
23            }
24            ans[i++] = el;
25            map.put(el,map.get(el)-1);
26            map.put(need,map.get(need)-1);
27        }
28        return ans;
29    }
30}
31 