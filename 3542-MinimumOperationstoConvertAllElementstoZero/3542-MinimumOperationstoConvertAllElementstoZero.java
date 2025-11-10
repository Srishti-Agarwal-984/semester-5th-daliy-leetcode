// Last updated: 11/10/2025, 12:50:44 PM
class Solution {
    public int minOperations(int[] arr) {
        
        List<Integer> li = new ArrayList<>();
        int ans=0;
        for(int el :arr){
            while(!li.isEmpty() && li.get(li.size()-1)> el){
                li.remove(li.size()-1);
            }
            if(el==0){
                continue;
            }
            if(li.isEmpty() || li.get(li.size()-1)<el){
                ans++;
                li.add(el);
            }
        }
        return ans;
    }
}