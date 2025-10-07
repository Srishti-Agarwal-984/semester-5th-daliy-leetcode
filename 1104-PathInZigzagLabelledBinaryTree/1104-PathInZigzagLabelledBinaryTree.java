// Last updated: 10/7/2025, 6:15:54 PM
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> l = new ArrayList<>();
        int i = Integer.toBinaryString(label).length()-1;
        //System.out.println(i);
        
        while(label>1) {
            l.add(label);
            i--;
            label = label/2;
            label = label^((1<<i)-1);
            //System.out.println(label);
        }
        l.add(1);
        Collections.reverse(l);
        return l;
    }
}