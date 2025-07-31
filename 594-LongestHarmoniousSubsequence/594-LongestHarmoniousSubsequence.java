// Last updated: 7/31/2025, 5:33:43 PM
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Integer key : map.keySet()) {
            if (map.containsKey(key+1)){
                int p = map.get(key)+map.get(key+1);
                ans=Math.max(ans, p);
            }
            if(map.containsKey(key-1)){
                int p = map.get(key)+map.get(key-1);
                ans=Math.max(ans, p);
            }
        }
        return ans;
    }
}