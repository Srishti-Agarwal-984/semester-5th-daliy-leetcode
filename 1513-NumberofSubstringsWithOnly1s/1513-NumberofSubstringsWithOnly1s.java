// Last updated: 11/16/2025, 5:58:32 PM
class Solution {
    int mod = 1000000007;
    public int numSub(String s) {
        long j = 0;
        char rt = s.charAt(0);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1') {
                c++;
            } else {
                int a = c, b = c + 1;
                if (a % 2 == 0) {
                    a = a / 2;
                } else {
                    b = b / 2;
                }
                long k = help(a,b);
                j = (j + k) % mod;
                c = 0;
                rt = s.charAt(i);
            }
        }
        int a = c, b = c + 1;
        if (a % 2 == 0) {
            a = a / 2;
        } else {
            b = b / 2;
        }
        long k = help(a,b);
        j = (j + k) % mod;
        return (int) (j);

    }
    public  long help(int a, int b){
        if(b==0){
            return 0;
        }
        long p = (a+(help(a, b-1)%mod))%mod;
        return p%mod;


    }
}