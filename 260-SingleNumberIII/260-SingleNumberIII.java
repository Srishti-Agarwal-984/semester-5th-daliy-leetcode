// Last updated: 1/14/2026, 12:24:31 PM
1class Solution {
2    public int[] singleNumber(int[] arr) {
3        int c=0;
4		for(int i: arr) {
5			c=c^i;
6		}
7		int mask = c&(~(c-1));
8		int a =0, b = 0;
9		for(int  i: arr) {
10			if((i&mask)==0) {
11				a = a^i;
12			}
13			else {
14				b = b^i;
15			}
16			
17		}
18		int[] ans = {a, b};
19		return ans;
20        
21    }
22}