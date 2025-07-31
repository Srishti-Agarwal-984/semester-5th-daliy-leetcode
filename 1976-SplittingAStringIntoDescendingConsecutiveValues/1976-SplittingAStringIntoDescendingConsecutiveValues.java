// Last updated: 7/31/2025, 5:29:58 PM
class Solution {
    static int cn=0;
    public boolean splitString(String s) {
        if (s.length() == 1) {
            return false;
        }
        boolean ans  = dfs(s, new ArrayList<>(), 0);
        if(cn==1){
            cn=0;
            ans=true;
        }
        return ans;
    }

    public static boolean dfs(String s, List<Long> ar, int count) {
        if (s.length() == 0) {
            if(count>=2){
                cn=1;
            }
            return count >= 2;
        }

        for (int cut = 1; cut <= s.length(); cut++) {
            String part = s.substring(0, cut);
            long num;
            try {
                num = Long.parseLong(part);
            } catch (NumberFormatException e) {
                return false; // In case of number too big for Long
            }

            if (ar.size() == 0 || ar.get(ar.size() - 1) - num == 1) {
                ar.add(num);
                boolean jk = dfs(s.substring(cut), ar, count + 1);
                // if (dfs(s.substring(cut), ar, count + 1)) {
                //     return true;
                // }
                ar.remove(ar.size() - 1); // backtrack
            }
        }

        return false;
    }
}
