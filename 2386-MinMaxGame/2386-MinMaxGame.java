// Last updated: 7/31/2025, 5:28:59 PM
class Solution {
    public int minMaxGame(int[] nums) {
        List<Integer> ar = Arrays.stream(nums).boxed().collect(Collectors.toList());
        while(ar.size()!=1){
            List<Integer> as = new ArrayList<>();
            int i=0;
            for(; i<ar.size(); i+=2){
                if(i%4==0){
                    as.add(Math.min(ar.get(i),ar.get(i+1)));

                }
                else{
                    as.add(Math.max(ar.get(i),ar.get(i+1)));
                }
            }
            ar=as;

        }
        return ar.get(0);
        
    }
}