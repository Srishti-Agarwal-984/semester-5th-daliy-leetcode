// Last updated: 9/5/2025, 5:42:49 AM
class Solution {
    public int score(String[] cards, char x) {
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        int both = 0;

        for (String c : cards) {
            if (c.charAt(0) == x && c.charAt(1) == x) {
                both++;
            } else if (c.charAt(0) == x) {
                left.put(c.charAt(1), left.getOrDefault(c.charAt(1), 0) + 1);
            } else if (c.charAt(1) == x) {
                right.put(c.charAt(0), right.getOrDefault(c.charAt(0), 0) + 1);
            }
        }

        int ans = 0;
        int p=0;

        // Pairs from left group
        if (!left.isEmpty()) {
            int total = 0, max = 0;
            for (int v : left.values()) {
                total += v;
                max = Math.max(max, v);
            }
            int u=total-max;
            if(max>=u){
                ans+=u;
                p=p+max-u;
            }
            else{
                ans+=total/2;
                p=p+total%2;
            }
        }

        // Pairs from right group
        if (!right.isEmpty()) {
            int total = 0, max = 0;
            for (int v : right.values()) {
                total += v;
                max = Math.max(max, v);
            }
            int u=total-max;
            if(max>=u){
                ans+=u;
                p=p+max-u;
            }
            else{
                ans+=total/2;
                p=p+total%2;
            }
        }

        int us = Math.min(p, both);
        both=both-us;
        ans=Math.min(ans*2, ans+both/2);
        ans+=us;


        return ans;

    }
}