// Last updated: 12/25/2025, 8:05:35 AM
1class Solution {
2    public int trap(int[] height) {
3        Stack<Integer> st = new Stack<>();
4        int sum=0;
5        int[] area = height;
6        for(int i=0; i<height.length; i++){
7            while(!st.isEmpty() && height[st.peek()]<=height[i]){
8                // System.out.println(st.peek()+ " "+height[st.peek()]);
9                // sum=sum+(area[st.peek()])*(i-st.peek());
10                int r = st.pop();
11                if(!st.isEmpty()){
12                    int e = st.peek();
13                    sum=sum+Math.min(height[e]-height[r], height[i]-height[r])*(i-e-1);
14                }
15            }
16            st.add(i);
17        }
18        return sum;
19        
20    }
21}