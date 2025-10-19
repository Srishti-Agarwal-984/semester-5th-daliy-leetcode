// Last updated: 10/20/2025, 12:18:46 AM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int el: nums){
            s.add(el);
        }
        int i=0;
        for(int el: nums){
            int a=0;
            while(el>0){
                a=a*10+el%10;
                el=el/10;
            }
            
            s.add(a);
        }
        return s.size();
    }
}