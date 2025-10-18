// Last updated: 10/18/2025, 6:06:54 PM
class Solution {
    public int largestRectangleArea(int[] arr) {
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