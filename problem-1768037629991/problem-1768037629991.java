// Last updated: 1/10/2026, 3:03:49 PM
1class Solution {
2    public int longestSubsequence(int[] arr, int difference) {
3        
4        HashMap<Integer, Integer> map = new HashMap<>();
5        int ans = 1;
6        int diff = difference;
7
8        for(int i=0; i<arr.length; i++){
9            if(map.containsKey(arr[i]-diff)){
10                int r = map.get(arr[i]-diff)+1;
11                map.put(arr[i], r);
12                ans=Math.max(ans, r);
13            }
14            else{
15                map.put(arr[i], 1);
16            }
17        }
18        return ans;
19        
20    }
21}