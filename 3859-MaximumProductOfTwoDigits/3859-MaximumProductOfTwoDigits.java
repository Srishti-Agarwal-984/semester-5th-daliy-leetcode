// Last updated: 7/31/2025, 5:25:57 PM
class Solution {
    public int maxProduct(int n) {
        List<Integer> ar = new ArrayList<>();
        while(n!=0){
            ar.add(n%10);
            n/=10;
        }
        Collections.sort(ar);
        return ar.get(ar.size()-1)*ar.get(ar.size()-2);
    }
}