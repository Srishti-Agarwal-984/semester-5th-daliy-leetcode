// Last updated: 7/31/2025, 5:26:07 PM
class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<Long> set = new HashSet<>();
        List<Long> m1 = new ArrayList<>();
        find(s,set);
        long sum=0;
        for(long kp : set){
            m1.add(kp);
            sum+=kp;
        }
        Collections.sort(m1);
        if(m1.size()<=3){
            return sum;
        }
        sum=0;
        for(int l =m1.size()-1;  l>=m1.size()-3; l--){
            sum+=m1.get(l);
        }
        return sum;
        
    }
    public static void find(String s,HashSet<Long> set){
        if(s.length()==0){
            return;
        }
        for(int i=1; i<=s.length(); i++){
            String kl = s.substring(0,i);
            if(Valid(Long.parseLong(kl))){
                set.add(Long.parseLong(kl));
            }
            find(s.substring(i),set);
        }
    }
    public static boolean Valid(long n){
        //System.out.print(n+" ");
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (long j = 5; j * j <= n; j += 6) {
            if (n % j == 0 || n % (j + 2) == 0)
                return false;
        }

        return true;
    }
    
}