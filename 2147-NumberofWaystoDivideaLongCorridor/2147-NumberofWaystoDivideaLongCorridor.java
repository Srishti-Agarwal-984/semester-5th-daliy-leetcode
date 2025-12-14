// Last updated: 12/15/2025, 12:25:23 AM
1class Solution {
2    int mod = 1000000007;
3    public int numberOfWays(String corridor) {
4        List<Integer> li = new ArrayList<>();
5        int r=0;
6        int c=0;
7        int e=0;
8        for(int i=0; i<corridor.length(); i++){
9            if(corridor.charAt(i)=='S'){
10                e++;
11                c++;
12            }
13            if(c==2){
14                r++;
15            }
16            if(c>=3){
17                li.add(r);
18                c=1;
19                r=0;
20            }
21
22        }
23        if(c>=2){
24            li.add(1);
25        }
26        long p=1;
27        if(li.size()==0 || e%2!=0){
28            return 0;
29        }
30        for(int p1 : li){
31            p=(p*p1%mod)%mod;
32        }
33        return (int)p;
34        
35    }
36    
37}