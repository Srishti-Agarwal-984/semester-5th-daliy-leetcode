// Last updated: 1/20/2026, 10:21:42 AM
1class Solution {
2    public long maxScore(int[] nums1, int[] nums2, int k) {
3        int[][] num = new int[nums1.length][2];
4        for(int i=0; i<nums1.length; i++){
5            num[i][0]=nums1[i];
6            num[i][1]=nums2[i];
7        }
8        Arrays.sort(num, (a, b)->a[1]-b[1]);
9        PriorityQueue<Integer> pq = new PriorityQueue<>();
10        long sum=0;
11        long ans=0;
12        long f=Integer.MAX_VALUE;
13        for(int i=num.length-1; i>=nums1.length-k; i--){
14            pq.add(num[i][0]);
15            sum=sum+num[i][0];
16            f= num[i][1];
17        }
18        ans= Math.max(ans, sum*f);
19        for(int i=nums1.length-k-1; i>=0; i--){
20            if(pq.peek()<num[i][0]){
21                sum=sum-pq.peek()+num[i][0];
22                pq.poll();
23                pq.add(num[i][0]);
24            }
25            f=num[i][1];
26            ans= Math.max(ans, sum*f);
27        }
28        return ans;
29
30    }
31}