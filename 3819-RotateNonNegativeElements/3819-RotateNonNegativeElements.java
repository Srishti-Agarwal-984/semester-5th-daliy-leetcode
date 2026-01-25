// Last updated: 1/26/2026, 12:00:02 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        List<Integer> li = new ArrayList<>();
4        int[] ans = new int[nums.length];
5        Arrays.fill(ans, Integer.MIN_VALUE);
6        for(int i=0; i<nums.length; i++){
7            if(nums[i]>=0){
8                li.add(i);
9            }
10            else{
11                ans[i]=nums[i];
12            }
13        }
14        if(li.size()==0){
15            return ans;
16        }
17        k = k%li.size();
18        int c=k;
19        int r=0;
20        int i=0;
21        while(i<nums.length){
22            int e = nums[li.get(c)];
23            while(i<nums.length && ans[i]!=Integer.MIN_VALUE){
24                i++;
25            }
26            if(i>=nums.length){
27                break;
28            }
29            ans[i] = e;
30            c = (c+1)%li.size();
31            i++;
32        }
33        return ans;
34
35        
36        
37    }
38}