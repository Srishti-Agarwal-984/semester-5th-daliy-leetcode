// Last updated: 7/31/2025, 5:25:42 PM
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            map.put(x[i],Math.max(map.getOrDefault(x[i], 0), y[i]));
        }
        if (map.size() < 3) {
            return -1;
        }
        PriorityQueue<Integer> m = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : map.values()) {
            m.add(val);
        }
        return m.poll() + m.poll() + m.poll();
    }
}