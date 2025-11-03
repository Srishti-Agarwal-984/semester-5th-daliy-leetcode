// Last updated: 11/3/2025, 12:50:43 PM
class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        long p =Math.abs((long)nums[0]*(long)nums[1]);
        long l = Math.abs((long)nums[0]*(long)nums[nums.length-1]);
        long t = Math.abs((long)nums[nums.length-2]*(long)nums[nums.length-1]);
        
        long r=Math.max(p,Math.max(l,t));
        //System.out.println(p);
        return r*100000l;
        
        
        
    }
}