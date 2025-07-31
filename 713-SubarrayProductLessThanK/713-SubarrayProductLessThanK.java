// Last updated: 7/31/2025, 5:33:21 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
		int ans =0;
		int ei=0, si=0;
		int p=1;
		while(ei<nums.length) {
			// grow
			p=p*nums[ei];
				// shrink
			while(p>=k && si<=ei) {
				p=p/nums[si];
				si++;
			}
			// ans update
			ans = ans+(ei-si+1);
			ei++;
			
		}
	    return (ans);
        
        
        
    }
}