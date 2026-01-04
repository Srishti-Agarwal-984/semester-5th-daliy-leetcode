// Last updated: 1/4/2026, 12:19:07 PM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        Arrays.sort(nums);
4        int ans=0;
5        for(int i=0; i<nums.length; i++){
6            ans=ans+helper(nums[i]);
7        }
8        return ans;
9    }
10    public int helper(int temp){
11        int e =0;
12        int f=0;
13        HashSet<Integer> st = new HashSet<>();
14        for(int i=2; i*i<=temp; i++){
15            if(temp%i==0){
16                st.add(i);
17                st.add(temp/i);
18               
19            }
20        }
21        if(st.size()==2){
22            for(int r: st){
23                e=e+r;
24            }
25            e = e+1+temp;
26            return e;
27        }
28        return 0;
29    }
30    
31}