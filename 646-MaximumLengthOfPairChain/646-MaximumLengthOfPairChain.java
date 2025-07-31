// Last updated: 7/31/2025, 5:33:29 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)->{
            return a[1]-b[1];
        });
        int count=0;
        int curr = Integer.MIN_VALUE;
        for(int[] p : pairs){
            if(p[0]>curr){
                count++;
                curr= p[1];
            }
        }
        return count;
    }
}