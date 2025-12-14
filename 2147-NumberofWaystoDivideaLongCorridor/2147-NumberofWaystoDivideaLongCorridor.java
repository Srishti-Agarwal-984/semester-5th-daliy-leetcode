// Last updated: 12/15/2025, 12:24:11 AM
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
16            
17            if(c>=3){
18                li.add(r);
19                c=1;
20                r=0;
21            }
22
23        }
24        if(c>=2){
25            li.add(1);
26        }
27        long p=1;
28        if(li.size()==0 || e%2!=0){
29            return 0;
30        }
31        for(int p1 : li){
32            p=(p*p1%mod)%mod;
33        }
34        return (int)p;
35        
36    }
37    public long helper(String corridor, int si, long[] dp){
38        if(si>=corridor.length()){
39            return 1;
40        }
41        if(dp[si]!=-1){
42            return dp[si];
43        }
44        long ans=0;
45        int c=0;
46        for(int i=si; i<corridor.length(); i++){
47            if(corridor.charAt(i)=='S'){
48                c++;
49            }
50            if(c==2){
51                ans=(ans+helper(corridor, i+1, dp)%mod)%mod;
52            }
53            if(c>=3){
54                break;
55            }
56
57        }
58        return dp[si]=ans;
59
60    }
61}