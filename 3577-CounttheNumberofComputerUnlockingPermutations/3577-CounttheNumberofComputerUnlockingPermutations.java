// Last updated: 12/10/2025, 8:09:20 PM
1class Solution {
2    int mod= 1000000007;
3    public int countPermutations(int[] complexity) {
4        int e = complexity[0];
5        int r=0;
6        for(int i=1; i<complexity.length; i++){
7            if(e>=complexity[i]){
8                r++;
9                break;
10            }
11        }
12        if(r==1){
13            return 0;
14        }
15        
16        int n = complexity.length;
17        long ans=fact(n-1);
18        return (int)(ans);
19
20        
21    }
22    public long fact(int n){
23        if(n==0 || n==1){
24            return 1;
25        }
26        long p = 1;
27        p=(p*(n)%mod)%mod;
28        p=(p*fact(n-1)%mod)%mod;
29        return p;
30    }
31}