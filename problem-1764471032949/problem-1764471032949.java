// Last updated: 11/30/2025, 8:20:32 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        //Arrays.sort(nums);
4        int r = nums.length;
5        TreeMap<Integer, Integer> map = new TreeMap<>();
6        for(int el: nums){
7            map.put(el, map.getOrDefault(el, 0)+1);
8        }
9        int ans=0;
10        //int e=map.size();
11        for(int k1:map.keySet()){
12            r=r-map.get(k1);
13            if(r>=k){
14                ans+=map.get(k1);
15            }
16            
17        }
18        return ans;
19        
20    }
21}