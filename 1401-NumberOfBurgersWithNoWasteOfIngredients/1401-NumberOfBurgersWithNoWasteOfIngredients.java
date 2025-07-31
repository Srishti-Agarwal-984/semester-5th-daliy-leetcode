// Last updated: 7/31/2025, 5:31:27 PM
class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> st = new ArrayList<>();
        if(tomatoSlices==0 && cheeseSlices==0){
            st.add(0);
            st.add(0);
            return st;
        }
        if(tomatoSlices%2!=0 || cheeseSlices>=tomatoSlices){
            return st;
        }
        long q = cheeseSlices*4;
        if(q<tomatoSlices){
            return st;
        }
        int q1 = cheeseSlices*2;
        if(tomatoSlices<q1){
            return st;
        }
        q1 = tomatoSlices-q1;
        q1=q1/2;
        st.add(q1);
        st.add(cheeseSlices-q1);
        return st;

    }
}