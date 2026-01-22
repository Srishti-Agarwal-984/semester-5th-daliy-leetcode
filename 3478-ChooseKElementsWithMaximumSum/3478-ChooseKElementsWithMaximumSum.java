// Last updated: 1/22/2026, 4:21:07 PM
1class Solution {
2    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
3        int[][] arr = new int[nums1.length][3];
4        for(int i=0; i<nums1.length; i++){
5            arr[i][0] = nums1[i];
6            arr[i][1] = nums2[i];
7            arr[i][2]=i;
8        }
9        Arrays.sort(arr, (a, b)->a[0]-b[0]);
10        PriorityQueue<Integer> pq = new PriorityQueue<>();
11        long sum=0;
12        long[] ans = new long[arr.length];
13        HashMap<Integer, Long> map = new HashMap<>();
14
15        for(int i=0; i<arr.length; i++){
16            ans[arr[i][2]]=sum;
17            if(map.containsKey(arr[i][0])){
18                ans[arr[i][2]] = map.get(arr[i][0]);
19            }
20            map.put(arr[i][0], ans[arr[i][2]]);
21            if(pq.size()<k){
22                pq.add(arr[i][1]);
23                sum=sum+arr[i][1];
24            }
25            else if(pq.size()==k && pq.peek()<arr[i][1]){
26                sum=sum-pq.peek();
27                pq.poll();
28                sum+=arr[i][1];
29                pq.add(arr[i][1]);
30            }
31        }
32        return ans;
33
34        
35    }
36}