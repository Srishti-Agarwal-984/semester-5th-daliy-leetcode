// Last updated: 12/21/2025, 12:04:41 AM
1class Solution {
2    public int maximumSum(int[] nums) {
3        Arrays.sort(nums);
4        int a0=0,b0=0,c0=0,a1=0,b1=0,c1=0,a2=0,b2=0,c2=0;
5        for(int i=nums.length-1; i>=0; i--){
6            if(nums[i]%3==0){
7                if(a0==0){
8                    a0=nums[i];
9                }
10                else if(b0==0){
11                    b0=nums[i];
12                }
13                else if(c0==0){
14                    c0=nums[i];
15                }
16            }
17            else if(nums[i]%3==1){
18                if(a1==0){
19                    a1=nums[i];
20                }
21                else if(b1==0){
22                    b1=nums[i];
23                }
24                else if(c1==0){
25                    c1=nums[i];
26                }
27            }
28            else{
29                if(a2==0){
30                    a2=nums[i];
31                }
32                else if(b2==0){
33                    b2=nums[i];
34                }
35                else if(c2==0){
36                    c2=nums[i];
37                }
38            }
39        }
40        int ans=0;
41        if(a0!=0 && b0!=0 && c0!=0){
42            ans=Math.max(ans, a0+b0+c0);
43        }
44        if(a1!=0 && b1!=0 && c1!=0){
45            ans=Math.max(ans, a1+b1+c1);
46        }
47        if(a2!=0 && b2!=0 && c2!=0){
48            ans=Math.max(ans, a2+b2+c2);
49        }
50        if(a0!=0 && a1!=0 && a2!=0){
51            ans=Math.max(ans, a0+a1+a2);
52        }
53        return ans;
54    }
55}