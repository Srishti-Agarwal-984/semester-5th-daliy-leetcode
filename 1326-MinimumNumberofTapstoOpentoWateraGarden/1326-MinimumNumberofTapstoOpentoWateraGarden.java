// Last updated: 10/17/2025, 8:30:06 PM
class Solution {
    public int minTaps(int n, int[] ranges) {
        Pair[] p  = new Pair[ranges.length];
        for(int i=0; i<p.length; i++){
            p[i]=new Pair(i-ranges[i], i+ranges[i]);
        }
        Arrays.sort(p, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return p1.st-p2.st;
            }
        });
        // int[][] dp = new int[p.length][n+1];
        HashMap<String,Integer> dp = new HashMap<>();
        
        int ans = helper(0, p, 0,n,dp);
        return ans>=10000000?-1:ans;
    }
    public int helper(int i, Pair[] p, int si, int n,HashMap<String,Integer> dp){
        if(si>=n){
            return 0;
        }
        if(i>=p.length){
            return 10000000;
        }
        if(dp.containsKey(i+"."+si)){
            return dp.get(i+"."+si);
        }
        int inc = 10000000;
        if(si>=p[i].st){
            inc = helper(i+1, p,Math.max(si,p[i].en),n,dp)+1;
        }
        else{
            return 10000000;
        }
        int exc = helper(i+1, p, si,n,dp);
        dp.put(i+"."+si,Math.min(inc,exc)>=10000000?10000000:Math.min(inc,exc));
        return Math.min(inc,exc)>=10000000?10000000:Math.min(inc,exc);
    }
    class Pair{
        int st;
        int en;
        public Pair(int st, int en){
            this.st = st;
            this.en = en;
        }
    }
}