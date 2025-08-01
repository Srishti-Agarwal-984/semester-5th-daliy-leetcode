// Last updated: 8/1/2025, 8:53:18 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();
        li1.add(1);
        li.add(li1);
        for(int i=1; i<numRows; i++){
            li1 = new ArrayList<>();
            li1.add(1);
            int p=1;
            int n=i;
            
            for(int j=0; j<=i-2; j++){
                p = (p*(n-j))/(j+1);
                li1.add(p);
            }
            li1.add(1);




            li.add(li1);
        }
        return li;
    }
}