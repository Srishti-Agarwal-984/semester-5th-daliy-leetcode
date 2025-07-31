// Last updated: 7/31/2025, 5:25:46 PM
class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int mod = 1_000_000_007;
        long result = 0;

        Map<Integer, Integer> rightMap = new HashMap<>();
        Map<Integer, Integer> leftMap = new HashMap<>();

        // Build rightMap with full frequencies
        for (int num : nums) {
            rightMap.put(num, rightMap.getOrDefault(num, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            int current = nums[j];
            rightMap.put(current, rightMap.get(current) - 1);  // j is no longer in the right side

            int target = current * 2;

            int leftCount = leftMap.getOrDefault(target, 0);
            int rightCount = rightMap.getOrDefault(target, 0);

            result = (result + (long) leftCount * rightCount) % mod;

            // Update leftMap for future iterations
            leftMap.put(current, leftMap.getOrDefault(current, 0) + 1);
        }

        return (int) result;
    }
}
