// Last updated: 9/28/2025, 2:19:08 PM
class Solution {
    public long countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans=0;
        for(int i=0; i<nums.length; i++){
            int a = findGcd(nums[i], k);
            for(int key : map.keySet()){
                if(((long) key*a)%k == 0){
                    ans += map.get(key);
                }
            }
            map.put(a, map.getOrDefault(a,0)+1);
        }
        return ans;
    }
    public int findGcd(int a, int b) {
        // Base case: if b is 0, then a is the GCD
        if (b == 0) {
            return a;
        }
        // Recursive step: gcd(a, b) = gcd(b, a % b)
        return findGcd(b, a % b);
    } 
}