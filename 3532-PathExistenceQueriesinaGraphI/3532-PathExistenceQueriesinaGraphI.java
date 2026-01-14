// Last updated: 1/14/2026, 8:36:53 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[] arr=new int[n];
4        int g=0;
5        arr[0]=0;
6        for(int i=1;i<n;i++){
7            if(nums[i]-nums[i-1]>maxDiff){
8                g++;
9            }
10            arr[i]=g;
11        }
12        int k=0;
13        boolean[] ans=new boolean[queries.length];
14        for(int[] q:queries){
15            int q1=q[0];
16            int q2=q[1];
17            if(arr[q1]==arr[q2]){
18                ans[k]=true;
19            }
20            else{
21                ans[k]=false;
22            }
23            k++;
24
25        }
26        return ans;
27        
28    }
29}