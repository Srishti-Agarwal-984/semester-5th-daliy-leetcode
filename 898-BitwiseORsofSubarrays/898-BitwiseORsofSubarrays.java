// Last updated: 11/15/2025, 7:45:38 PM
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
         HashSet<Integer> result = new HashSet<>();   // final unique OR values
        HashSet<Integer> cur = new HashSet<>();      // ORs ending at current index
        
        for (int x : arr) {
            HashSet<Integer> next = new HashSet<>();
            
            // Subarray that starts and ends at current element
            next.add(x);
            
            // Extend old subarrays by OR with x
            for (int val : cur) {
                next.add(val | x);
            }
            
            // Add all new ORs to global result
            result.addAll(next);
            
            // Move next to cur for next iteration
            cur = next;
        }
        
        return result.size();
        
    }
}