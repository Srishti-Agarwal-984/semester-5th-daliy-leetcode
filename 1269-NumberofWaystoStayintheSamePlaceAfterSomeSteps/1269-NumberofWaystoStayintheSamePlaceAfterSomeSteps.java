// Last updated: 10/31/2025, 1:26:07 PM
class Solution {
    int mod = 1000000007;
    Map<String, Integer> map = new HashMap<>();
    public int numWays(int steps, int arrLen) {
        
        return helper(0, steps,arrLen);

        
    }
    public int helper(int i ,int steps, int arrLen){
        if(i<0 || i>=arrLen){
            return 0;
        }
        if(i==0 && steps==0){
            return 1;
        }
        if(steps==0){
            return 0;
        }
        String s = steps+"-"+i;
        //System.out.println(i);
        if(map.containsKey(s)){
            return map.get(s);
        }
        int ans = 0;
        ans=(ans+helper(i+1, steps-1,arrLen)%mod)%mod;
        ans=(ans+helper(i-1, steps-1,arrLen)%mod)%mod;
        ans=(ans+helper(i, steps-1,arrLen)%mod)%mod;
        map.put(s, ans);
        return ans;
    }
}