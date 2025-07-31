// Last updated: 7/31/2025, 5:31:25 PM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans  = new ArrayList<>();
        boolean[]  l = new boolean[groupSizes.length];
        for(int i=0; i<groupSizes.length; i++){
            if(l[i]){
                continue;
            }
            List<Integer> ans1  = new ArrayList<>();
            int s = groupSizes[i];
            for(int j=i; j<groupSizes.length; j++){
                if(groupSizes[i]==groupSizes[j] && s>=1){
                    ans1.add(j);
                    l[j]=true;
                    s--;
                }
            }
            ans.add(ans1);
        }
        return ans;
    }
}