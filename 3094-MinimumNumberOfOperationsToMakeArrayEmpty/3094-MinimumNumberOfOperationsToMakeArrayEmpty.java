// Last updated: 7/31/2025, 5:27:51 PM
class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                c++;
            } else {
                if (c <= 1) {
                    return -1;
                }
                ans += c / 3 + 1;
                if(c%3==0){
                    ans--;
                }
                c = 1;
                //System.out.println(ans+"  "+nums[i]);
            }
        }
        if (c <= 1) {
            return -1;
        }
        ans += c / 3 + 1;
        if(c%3==0){
            ans--;
        }
        return ans;
    }
}