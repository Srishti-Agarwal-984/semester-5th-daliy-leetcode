// Last updated: 7/31/2025, 5:30:56 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i=1;
        int u=0;
        while(u<target.length){
            if(target[u]==i){
                u++;
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            i=i+1;
        }
        return ans;
        
    }
}