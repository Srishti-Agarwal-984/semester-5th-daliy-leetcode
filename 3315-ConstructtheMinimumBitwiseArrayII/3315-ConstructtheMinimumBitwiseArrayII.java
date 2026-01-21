// Last updated: 1/21/2026, 11:51:37 AM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int[] ans = new int[nums.size()];
4        Arrays.fill(ans,-1);
5        for(int i=0; i<nums.size(); i++){
6            if(nums.get(i)%2==0){
7                continue;
8            }
9            int c=0;
10            int r = nums.get(i);
11            while(r>0 && r%2==1){
12                c++;
13                r=r/2;
14            }
15            c--;
16            int e = (1<<c);
17            ans[i]=nums.get(i)^e;
18        }
19        return ans;
20
21        
22    }
23}