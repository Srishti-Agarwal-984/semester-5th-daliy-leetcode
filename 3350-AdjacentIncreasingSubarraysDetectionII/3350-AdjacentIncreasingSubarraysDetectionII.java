// Last updated: 1/8/2026, 8:38:21 AM
1class Solution {
2    public int maxIncreasingSubarrays(List<Integer> nums) {
3        List<Integer> li = new ArrayList<>();
4        int c=0;
5        int a = Integer.MIN_VALUE;
6        for(int i=0; i<nums.size(); i++){
7            if(a<nums.get(i)){
8                c++;
9                a = nums.get(i);
10            }
11            else{
12                li.add(c);
13                c=1;
14                a = nums.get(i);
15            }
16        }
17        li.add(c);
18      //  System.out.println(li);
19        int max = 0;
20        for(int i=0; i<li.size(); i++){
21           // System.out.println(li);
22            max = Math.max(max, li.get(i)/2);
23            if(i<li.size()-1){
24                max = Math.max(max, Math.min(li.get(i), li.get(i+1)));
25            }
26        }
27        return max;
28
29        
30    }
31}