// Last updated: 11/28/2025, 1:58:01 PM
1class Solution {
2    HashSet<Integer> visited = new HashSet<>();
3    public int componentValue(int[] nums, int[][] edges) {
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5        int sum=0;
6        int n=nums.length;
7        for(int el: nums){
8            sum+=el;
9
10        }
11        for(int i=0; i<n; i++){
12            map.put(i, new HashSet<>());
13        }
14        for(int[] a: edges){
15            map.get(a[0]).add(a[1]);
16            map.get(a[1]).add(a[0]);
17        }
18        int ans=0;
19        for(int i=2; i<=n; i++){
20            visited = new HashSet<>();
21            visited.add(0);
22            if(sum%i==0){
23                int[] r = new int[1];
24                helper(map, nums, 0, r, sum/i);
25                if(r[0]==i){
26                    ans=Math.max(ans, r[0]-1);
27                }
28                
29            }
30        }
31        return ans;
32
33        
34    }
35    public int helper(HashMap<Integer, HashSet<Integer>> map, int[] nums, int node,int[] r, int k){
36        int sum=nums[node];
37        for(int nbrs: map.get(node)){
38            if(!visited.contains(nbrs)){
39                visited.add(nbrs);
40                sum+=helper(map, nums,  nbrs, r,  k);
41                
42            }
43        }
44        if(sum==k){
45            r[0]++;
46            sum=0;
47        }
48        return sum;
49    }
50}