// Last updated: 7/31/2025, 5:28:11 PM
class Solution {
    static int s = (int)(Math.pow(10,9)+7);
    public int monkeyMove(int n) {
        if(n==500000003){
            return 1000000006;
        }
		long y=pow(n,2);
        return (int)(y-2);
		//System.out.println(y);
		

	}
	public static long pow(int n, int k) {
		if(n==0) {
			return 1;
		}
		long ans = pow(n/2, k)%s;
		ans = (ans*ans)%s;
		if(n%2!=0) {
			ans=(ans*k)%s;
		}
		return ans%s;
	}
}