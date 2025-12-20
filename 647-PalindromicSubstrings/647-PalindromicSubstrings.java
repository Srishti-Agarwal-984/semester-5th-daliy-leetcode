// Last updated: 12/20/2025, 12:39:54 PM
1class Solution {
2    public int countSubstrings(String s) {
3        pair[][] dp = new pair[s.length()][s.length()];
4        for(pair[] ol: dp){
5            Arrays.fill(ol, new pair(false, -1));
6        }
7        return ans(s, 0, s.length()-1, dp).l;
8        
9    }
10    class pair{
11        boolean t;
12        int l;
13        public pair(boolean t, int l){
14            this.t=t;
15            this.l=l;
16        }
17
18    }
19    public pair ans(String s, int si, int en, pair[][] dp){
20        if(si>en){
21            return new pair(true, 0);
22        }
23        if(dp[si][en].l!=-1){
24            return dp[si][en];
25        }
26        int as=0;
27        pair p1 = ans(s, si+1, en, dp);
28        pair p2 = ans(s, si, en-1, dp);
29        pair p3 = ans(s, si+1, en-1, dp);
30        boolean op = false;
31        if(p3.t && s.charAt(si)==s.charAt(en)){
32            op = true;
33            as++;
34
35        }
36        as+=p1.l;
37        as+=p2.l-p3.l;
38        return dp[si][en]=new pair(op, as);
39    }
40}
41