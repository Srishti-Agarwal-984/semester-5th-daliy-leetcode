// Last updated: 7/31/2025, 5:32:42 PM
class Solution {
    public int totalFruit(int[] fruits) {
        List<Integer> ar = new ArrayList<>();
        int si=0,di=0;
        int ans=0;
        int i=0;
        for(i=0; i<fruits.length; i++){
            if(ar.size()==0){
                ar.add(fruits[i]);
            }
            else if(ar.contains(fruits[i])){
                if(fruits[i]!=fruits[di]){
                    di=i;
                }

            }
            else if (!ar.contains(fruits[i]) && ar.size()==1){
                ar.add(fruits[i]);
                di=i;
            }
            else if(!ar.contains(fruits[i]) && ar.size()==2){
                si=di;
                ar = new ArrayList<>();
                ar.add(fruits[di]);
                i=i-1;
            }
            else{
                continue;
            }
            ans=Math.max(ans, i-si+1);
        }
        return ans;
        
    }
}