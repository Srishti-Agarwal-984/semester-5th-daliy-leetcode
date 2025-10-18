// Last updated: 10/18/2025, 6:05:50 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == '1') heights[j]++;
                else heights[j] = 0;
            }
            maxArea = Math.max(maxArea, Area(heights));
        }
        return maxArea;
    }
    public int Area(int[] arr){
        int ans = 0;
		int c=0;
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h= arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					ans=Math.max(h*r, ans);
				}
				else {
					int l= st.peek();
					int area = h*(r-l-1);
					ans= Math.max(ans,  area);
				}
			}
			st.push(i);
		}
		int r= arr.length;
		while(!st.isEmpty()) {
			int h= arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(h*r, ans);
			}
			else {
				int l= st.peek();
				int area = h*(r-l-1);
				ans= Math.max(ans,  area);
			}
			
		}
        return ans;
    }
}