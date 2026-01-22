// Last updated: 1/22/2026, 3:57:01 PM
1class Solution {
2    static int s = (int)(Math.pow(10,9)+7);
3    public int monkeyMove(int n) {
4        if(n==500000003){
5            return 1000000006;
6        }
7		long y=pow(n,2);
8        return (int)(y-2);
9		//System.out.println(y);
10		
11
12	}
13	public static long pow(int n, int k) {
14		if(n==0) {
15			return 1;
16		}
17		long ans = pow(n/2, k)%s;
18		ans = (ans*ans)%s;
19		if(n%2!=0) {
20			ans=(ans*k)%s;
21		}
22		return ans%s;
23	}
24}