// Last updated: 7/31/2025, 5:32:19 PM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int i=0, si=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans =0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k && si<=i){
                map.put(nums[si],map.getOrDefault(nums[si],0)-1);
                if(map.get(nums[si])<=0){
                    map.remove(nums[si]);
                }
                si++;
            }
            ans+=i-si+1;
            i++;
        }
        int ans1= ans;
        ans=0;
        i=0;
        si=0;
        k=k-1;
        map = new HashMap<>();
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k && si<=i){
                map.put(nums[si],map.getOrDefault(nums[si],0)-1);
                if(map.get(nums[si])<=0){
                    map.remove(nums[si]);
                }
                si++;
            }
            ans+=i-si+1;
            i++;
        }
        return ans1-ans;

    }
}