// Last updated: 12/20/2025, 11:53:01 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
6        }
7        int ans=0;
8        for(int i=0; i<nums.length; i=i+3){
9            if(map.size()==nums.length-i){
10                break;
11            }
12            map.put(nums[i], map.get(nums[i])-1);
13            if(map.get(nums[i])==0){
14                map.remove(nums[i]);
15            }
16            if(i+1<nums.length){
17                map.put(nums[i+1], map.get(nums[i+1])-1);
18                if(map.get(nums[i+1])==0){
19                    map.remove(nums[i+1]);
20                }
21            }
22            if(i+2<nums.length){
23                map.put(nums[i+2], map.get(nums[i+2])-1);
24                if(map.get(nums[i+2])==0){
25                    map.remove(nums[i+2]);
26                }
27            }
28            ans++;
29
30        }
31        return ans;
32    }
33}