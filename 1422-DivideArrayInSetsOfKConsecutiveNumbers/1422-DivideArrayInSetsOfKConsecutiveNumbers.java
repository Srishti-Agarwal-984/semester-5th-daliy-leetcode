// Last updated: 7/31/2025, 5:31:20 PM
class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int el : hand){
            mp.put(el,mp.getOrDefault(el,0)+1);
        }
        for(int key : mp.keySet()){
            int freq = mp.get(key);
            if(freq > 0){
                for(int i = 0; i<groupSize; i++){
                    int curr = key+i;
                    if(mp.getOrDefault(curr,0) < freq){
                        return false;
                    }
                    mp.put(curr,mp.get(curr)-freq);
                }
            }
        }
        return true;
    }
}