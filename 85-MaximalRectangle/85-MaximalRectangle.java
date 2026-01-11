// Last updated: 1/11/2026, 1:59:32 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if(matrix.length == 0) return 0;
4        int n = matrix[0].length;
5        int[] heights = new int[n];
6        int maxArea = 0;
7        
8        for(int i=0; i<matrix.length; i++){
9            for(int j=0; j<n; j++){
10                if(matrix[i][j] == '1') heights[j]++;
11                else heights[j] = 0;
12            }
13            maxArea = Math.max(maxArea, Area(heights));
14        }
15        return maxArea;
16    }
17    public int Area(int[] arr){
18        int ans = 0;
19		int c=0;
20		Stack<Integer> st = new Stack<>();
21		for(int i=0; i<arr.length; i++) {
22			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
23				int h= arr[st.pop()];
24				int r=i;
25				if(st.isEmpty()) {
26					ans=Math.max(h*r, ans);
27				}
28				else {
29					int l= st.peek();
30					int area = h*(r-l-1);
31					ans= Math.max(ans,  area);
32				}
33			}
34			st.push(i);
35		}
36		int r= arr.length;
37		while(!st.isEmpty()) {
38			int h= arr[st.pop()];
39			if(st.isEmpty()) {
40				ans=Math.max(h*r, ans);
41			}
42			else {
43				int l= st.peek();
44				int area = h*(r-l-1);
45				ans= Math.max(ans,  area);
46			}
47			
48		}
49        return ans;
50    }
51}