// Last updated: 7/31/2025, 5:31:49 PM
class Solution {
    public int movesToMakeZigzag(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int ans = 0;
        int i = 0;
        for (i = 1; i < nums.length - 1; i++) {
            if (i % 2 != 0) {
                int r = (nums[i] - nums[i - 1] >= 0) ? nums[i] - nums[i - 1]+1 : 0;
                int e = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1]+1 : 0;
                ans += Math.max(r, e);
            }
        }
        if (i % 2 != 0) {
            int r = (nums[i] - nums[i - 1] >= 0) ? nums[i] - nums[i - 1]+1 : 0;
            //int e = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1] : 0;
            ans += r;
        }
        int ans2=0;
        i=0;
        if (i % 2 == 0) {
            int r = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1]+1 : 0;
            //int e = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1] : 0;
            ans2 += r;
        }
        for (i = 1; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                int r = (nums[i] - nums[i - 1] >= 0) ? nums[i] - nums[i - 1]+1 : 0;
                int e = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1] +1: 0;
                ans2 += Math.max(r, e);
            }
        }
        if (i % 2 == 0) {
            int r = (nums[i] - nums[i - 1] >= 0) ? nums[i] - nums[i - 1]+1 : 0;
            //int e = (nums[i] - nums[i + 1] >= 0) ? nums[i] - nums[i + 1] : 0;
            ans2 += r;
        }
        return Math.min(ans, ans2);

    }
}