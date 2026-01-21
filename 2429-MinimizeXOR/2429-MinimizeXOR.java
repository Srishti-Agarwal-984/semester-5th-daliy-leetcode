// Last updated: 1/21/2026, 12:40:44 PM
1class Solution {
2    public int minimizeXor(int nums1, int nums2) {
3        int c=0;
4		while(nums2>0) {
5			c+=nums2%2;
6			nums2/=2;
7		}
8		int x=0;
9		for(int i=30; i>=0; i--) {
10			int mask = 1<<i;
11			if((nums1&mask)!=0) {
12				x|=mask;
13				c--;
14				if(c==0) {
15					return x;
16				}
17			}
18		}
19		for(int i=0; i<=30; i++) {
20			int mask = 1<<i;
21			if((nums1&mask)==0) {
22				x|=mask;
23				c--;
24				if(c==0) {
25					return x;
26				}
27			}
28		}
29		
30		return x;
31    }
32}