// Last updated: 7/31/2025, 5:33:15 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<asteroids.length; i++){
            int w=0;
            while(!st.isEmpty() && (st.peek()>0 && asteroids[i]<0)){
                int r = Math.abs(st.peek()), l= Math.abs(asteroids[i]);
                if(r>l){
                    w=1;
                    break;

                }
                else if(r<l){
                    st.pop();
                }
                else{
                    w=1;
                    st.pop();
                    break;
                }
            }
            if(w==0){
                st.push(asteroids[i]);

            }
            
        }
        int u=st.size()-1;
        int[] ans = new int[u+1];
        while(!st.isEmpty()){
            // System.out.println(st.pop()+" "+u);
            ans[u]=st.pop();
            u--;
        }
        

        return ans ;
    }
}