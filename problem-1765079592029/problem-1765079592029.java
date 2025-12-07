// Last updated: 12/7/2025, 9:23:12 AM
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        Integer[] nums1 = new Integer[nums.length];
4        for(int i=0; i<nums.length; i++){
5            nums1[i]=nums[i];
6        }
7        
8        Arrays.sort(nums1, (a, b)->{
9            long rA = helper(a);
10            long rB = helper(b);
11            if(rA!=rB){
12                return Long.compare(rA, rB);
13            }
14            else{
15                return Integer. compare(a, b);
16            }
17        });
18        for(int i=0; i<nums.length; i++){
19            nums[i]=nums1[i];
20        }
21        
22        return nums;
23            
24        
25    }
26    private long helper(int n){
27        String s = Integer.toBinaryString(n);
28        StringBuilder sb = new StringBuilder(s).reverse();
29        return Long.parseLong(sb.toString(), 2);
30    }
31}