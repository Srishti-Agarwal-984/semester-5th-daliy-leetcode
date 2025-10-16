// Last updated: 10/16/2025, 11:31:05 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> li = new ArrayList<>();
        int n =0;
        for(int i=0; i<capacity.length; i++){
            if(capacity[i]==rocks[i]){
                n++;
                continue;
            }
            li.add(capacity[i]-rocks[i]);
        }
        Collections.sort(li);
        for(int i=0; i<li.size(); i++){
            if(additionalRocks>=li.get(i)){
                n++;
                additionalRocks-=li.get(i);
            }
            else{
                break;
            }
        }
        return n;
        
    }
}