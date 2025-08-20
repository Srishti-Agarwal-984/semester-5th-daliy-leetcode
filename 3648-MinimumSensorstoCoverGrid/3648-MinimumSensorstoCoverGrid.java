// Last updated: 8/20/2025, 11:31:23 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int s = 2 * k + 1;                 
        int r = (n + s - 1) / s;       
        int c = (m + s - 1) / s;       
        return r*c;
    }
}