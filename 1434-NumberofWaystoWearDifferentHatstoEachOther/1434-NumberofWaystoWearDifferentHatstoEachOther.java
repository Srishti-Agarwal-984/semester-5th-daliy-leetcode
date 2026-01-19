// Last updated: 1/19/2026, 3:36:57 PM
1class Solution {
2    int mod = 1000000007;
3    int full;
4    int[][] dp ;
5    public int numberWays(List<List<Integer>> hats) {
6        full=(1<<hats.size())-1;
7        // HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
8        // for(int i=0; i<hats.size(); i++){
9        //     map.put(i, new HashSet<>());
10        //     for(int j=0; j<hats.get(i).size(); j++){
11        //         map.get(i).add(hats.get(i).get(j));
12        //     }
13        // }
14        int n = hats.size();
15        dp = new int[41][1<<n];
16        for(int[] r: dp){
17            Arrays.fill(r, -1);
18        }
19        List<Integer>[] arr = new ArrayList[41];
20        for(int i=1; i<=40; i++){
21            arr[i]=new ArrayList<>();
22
23        }
24        for(int i=0; i<hats.size(); i++){
25            for(int u: hats.get(i)){
26                arr[u].add(i);
27            }
28        }
29        return helper(arr,1, 0);
30 
31    }
32    public int helper(List<Integer>[] arr , int hat, int mask){
33        if(mask==full){
34            return 1;
35        }
36        if(hat>40){
37            return 0;
38        }
39        if(dp[hat][mask]!=-1){
40            return dp[hat][mask];
41        }
42        int ans=helper(arr, hat+1, mask);
43        for (int p : arr[hat]) {
44            if ((mask & (1 << p)) == 0) {
45                ans += helper(arr, hat+1, mask|(1<<p));
46                ans %= mod;
47            }
48        }
49
50        return dp[hat][mask] = (int) ans;
51    }
52}