// Last updated: 7/31/2025, 5:26:15 PM
class Solution {
    public int maxDistance(String s1, int k) {
        int ne = 0, nw = 0, se = 0, sw = 0;
        int ans=0;
        int c=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'N' || s1.charAt(i)=='E') {
                ne++;
            } else if (s1.charAt(i) == 'W' && c<k) {
                ne++;
                c++;
            } else if (s1.charAt(i) == 'S' && c<k) {
                ne++;
                c++;
            } else {
                ne--;
            }
            ans=Math.max(ans, ne);
        }
        c=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'N' || s1.charAt(i)=='W') {
                nw++;
            } else if (s1.charAt(i) == 'E' && c<k) {
                nw++;
                c++;
            } else if (s1.charAt(i) == 'S' && c<k) {
                nw++;
                c++;
            } else {
                nw--;
            }
            ans=Math.max(ans, nw);
        }
        c=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'S' || s1.charAt(i)=='E') {
                se++;
            } else if (s1.charAt(i) == 'W' && c<k) {
                se++;
                c++;
            } else if (s1.charAt(i) == 'N' && c<k) {
                se++;
                c++;
            } else {
                se--;
            }
            ans=Math.max(ans, se);
        }
        c=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'S' || s1.charAt(i)=='W') {
                sw++;
            } else if (s1.charAt(i) == 'E' && c<k) {
                sw++;
                c++;
            } else if (s1.charAt(i) == 'N' && c<k) {
                sw++;
                c++;
            } else {
                sw--;
            }
            ans=Math.max(ans, sw);
        }
        return ans;
    }
}