// Last updated: 12/21/2025, 9:20:38 AM
1class Solution {
2    public int minSwaps(int[] nums, int[] forbidden) {
3        List<Integer> li = new ArrayList<>();
4        for(int i=0; i<nums.length; i++){
5            if(nums[i]== forbidden[i]){
6                li.add(i);
7            }
8        }
9        if(li.size()==0){
10            return 0;
11        }
12        Map<Integer, Integer> map =new HashMap<>();
13        for(int i: nums){
14            map.put(i, map.getOrDefault(i, 0)+1);
15        }
16        for(int i: forbidden){
17            map.put(i, map.getOrDefault(i, 0)+1);
18        }
19        int max = 0;
20        for(int i: map.keySet()){
21            max = Math.max(max, map.get(i));
22        }
23        if(max>nums.length){
24            return -1;
25        }
26         map =new HashMap<>();
27        for(int i: li){
28            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
29        }
30        if(map.size()==1){
31            for(int r: map.keySet()){
32                return map.get(r);
33            }
34        }
35        if(li.size()%2==0){
36            return li.size()/2;
37        }
38        return (li.size()-1)/2+1;
39        
40        
41    }
42}