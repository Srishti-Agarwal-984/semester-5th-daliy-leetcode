// Last updated: 7/31/2025, 5:29:06 PM
class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ar = Arrays.stream(nums).boxed().collect(Collectors.toList());
        while(ar.size()!=1){
            List<Integer> as = new ArrayList<>();
            int i=0;
            for(; i<ar.size()-1; i++){
                as.add((ar.get(i)+ar.get(i+1))%10);
            }
            ar=as;

        }
        return ar.get(0);
        
    }
}