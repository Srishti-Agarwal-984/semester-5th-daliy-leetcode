// Last updated: 7/31/2025, 5:34:23 PM
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;

            int slow = i;
            int fast = i;
            boolean isForward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, isForward, slow);
                fast =  nextIndex(nums, isForward, fast);

                if (slow == -1 || fast == -1) break;
                fast = nextIndex(nums, isForward, fast);
                if(fast==-1){
                    break;
                }
                if (slow == fast) {
                    return true;
                }
            }

            // Mark visited nodes as 0
            // int index = i;
            // while (nums[index] != 0 && (nums[index] > 0) == isForward) {
            //     int next = nextIndex(nums, isForward, index);
            //     nums[index] = 0; // Mark visited
            //     if (next == -1) break;
            //     index = next;
            // }
        }

        return false;
    }

    private int nextIndex(int[] nums, boolean isForward, int currentIndex) {
        boolean direction = nums[currentIndex] > 0;
        if (isForward != direction) return -1; // Direction mismatch

        int n = nums.length;
        int nextIndex = ((currentIndex + nums[currentIndex]) % n + n) % n;

        if (nextIndex == currentIndex) return -1; // Single-element loop

        return nextIndex;
    }
}