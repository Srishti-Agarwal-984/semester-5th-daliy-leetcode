// Last updated: 10/20/2025, 12:17:21 AM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int el: nums){
            s.add(el);
        }
        int i=0;
        for(int el: nums){
            StringBuilder s1= new StringBuilder(String.valueOf(el));
            s1.reverse(); 
            s.add(Integer.parseInt(s1.toString()));
        }
        return s.size();
    }
}