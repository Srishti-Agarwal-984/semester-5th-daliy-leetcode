// Last updated: 1/26/2026, 2:17:20 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int y=1000000;
5        for(int i=0; i<arr.length-1; i++){
6            y=Math.min(y, Math.abs(arr[i]-arr[i+1]));
7        }
8        List<List<Integer>> ans = new ArrayList<>();
9        for(int i=0; i<arr.length-1; i++){ 
10            if(y==Math.abs(arr[i]-arr[i+1])){
11                List<Integer> ans1 = new ArrayList<>();
12                ans1.add(arr[i]);
13                ans1.add(arr[i+1]);
14                ans.add(ans1);
15            }
16            
17        }
18        return ans;
19
20
21        
22    }
23}