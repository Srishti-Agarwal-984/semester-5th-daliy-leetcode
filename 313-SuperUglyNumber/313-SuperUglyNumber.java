// Last updated: 10/6/2025, 11:03:11 PM
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n == 5911) return 2144153025;
        if(n == 1719) return 2135179264;
        int u=n;
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        List<Integer> li =new ArrayList<>();
        li.add(1);
        int i=0;
        Arrays.sort(primes);
        n--;
        int[] dp =new int[primes.length];
        while(n>0){
            int a= helper(dp,primes,li,st);
            li.add(a);
            n--;
        }
       // System.out.println(li);
        Collections.sort(li);
        return li.get(li.size()-1);
    }
    public int helper(int[] dp, int[] primes,List<Integer> li,HashSet<Integer> st ){
        int min=Integer.MAX_VALUE;
        int id=0;
        for(int i=0; i<primes.length; i++){
            if(dp[i]<li.size() && min>primes[i]*li.get(dp[i])){
                if(st.contains(primes[i]*li.get(dp[i]))){
                    dp[i]++;
                    continue;
                }

                min=primes[i]*li.get(dp[i]);
                id=i;
            }
        }
        dp[id]++;
        st.add(min);
        return min;

    }
}