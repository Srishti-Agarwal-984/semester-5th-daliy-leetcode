// Last updated: 12/26/2025, 2:44:53 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] num = new int[nums1.length+nums2.length];
4        for(int i=0; i<nums1.length; i++){
5            num[i]=nums1[i];
6        }
7        int c = nums1.length;
8        for(int i=0; i<nums2.length; i++){
9            num[c]=nums2[i];
10            c++;
11        }
12        Arrays.sort(num);
13        if(num.length%2!=0){
14            double a = num[num.length/2];
15            return a;
16        }
17        double a = num[num.length/2];
18        double b = num[(num.length-1)/2];
19        return (a+b)/2.0;
20
21        
22    }
23}