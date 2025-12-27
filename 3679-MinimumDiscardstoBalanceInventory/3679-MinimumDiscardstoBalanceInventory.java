// Last updated: 12/27/2025, 5:30:53 PM
1class Solution {
2    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
3        if(w==1){
4            return 0;
5        }
6        HashSet<Integer> st = new HashSet<>();
7
8        HashMap<Integer, Integer> map = new HashMap<>();
9        int ans=0;
10        for(int i=0; i<w; i++){
11            map.put(arrivals[i], map.getOrDefault(arrivals[i], 0)+1);
12            if(map.get(arrivals[i])>m){
13                map.put(arrivals[i], map.get(arrivals[i])-1);
14                st.add(i);
15                if(map.get(arrivals[i])==0){
16                    map.remove(arrivals[i]);
17                }
18                ans++;
19            }
20        }
21        for(int i=w; i<arrivals.length; i++){
22            if(!st.contains(i-w)){
23                 map.put(arrivals[i-w], map.get(arrivals[i-w])-1);
24            }
25            map.put(arrivals[i], map.getOrDefault(arrivals[i], 0)+1);
26            if(map.get(arrivals[i])>m){
27                map.put(arrivals[i], map.get(arrivals[i])-1);
28                st.add(i);
29                if(map.get(arrivals[i])==0){
30                    map.remove(arrivals[i]);
31                }
32                ans++;
33            }
34
35        }
36        return ans;
37        
38    }
39}