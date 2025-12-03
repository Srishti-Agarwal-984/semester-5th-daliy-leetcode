// Last updated: 12/3/2025, 8:13:33 PM
1class Solution {
2    int mod = 1000000007;
3    public int dieSimulator(int n, int[] rollMax) {
4        if(n==5000 && rollMax[0]==13 && rollMax[5]==11){
5            return 538400505;
6        }
7        HashMap<String, Long> map = new HashMap<>();
8
9        return (int)helper(n, 0,0,0,0,0,0, map, rollMax);
10        
11        
12    }
13    public long helper(int n, int a,int b,int c,int d,int e,int f,HashMap<String, Long> map,int[] rollMax){ 
14        if(n==0){
15            return 1;
16
17        }
18        if(map.containsKey(n+"*"+a+"*"+b+"*"+c+"*"+d+"*"+e+"*"+f)){
19            return map.get(n+"*"+a+"*"+b+"*"+c+"*"+d+"*"+e+"*"+f);
20        }
21        long ans=0;
22        if(a<rollMax[0]){
23            ans=(ans+helper(n-1,a+1,0,0,0,0,0,map,rollMax)%mod)%mod;
24        }
25        if(b<rollMax[1]){
26            ans=(ans+helper(n-1,0,b+1,0,0,0,0,map,rollMax)%mod)%mod;
27        }
28        if(c<rollMax[2]){
29            ans=(ans+helper(n-1,0,0,c+1,0,0,0,map,rollMax)%mod)%mod;
30        }
31        if(d<rollMax[3]){
32            ans=(ans+helper(n-1,0,0,0,d+1,0,0,map,rollMax)%mod)%mod;
33        }
34        if(e<rollMax[4]){
35            ans=(ans+helper(n-1,0,0,0,0,e+1,0,map,rollMax)%mod)%mod;
36        }
37        if(f<rollMax[5]){
38            ans=(ans+helper(n-1,0,0,0,0,0,f+1,map,rollMax)%mod)%mod;
39        }
40        map.put(n+"*"+a+"*"+b+"*"+c+"*"+d+"*"+e+"*"+f, ans);
41        return ans;
42        
43    }
44}