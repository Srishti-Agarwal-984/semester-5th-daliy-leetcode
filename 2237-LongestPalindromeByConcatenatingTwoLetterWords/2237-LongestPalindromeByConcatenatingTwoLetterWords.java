// Last updated: 7/31/2025, 5:29:23 PM
class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        int cn=0;
        int r1=0;
        for(int i=0; i<words.length; i++){
            if(map.containsKey(words[i])){
                int r = map.get(words[i]);
                map.put(words[i], r+1);

            }
            else{
                map.put(words[i], 1);
            }
        }
        for(String item : map.keySet()){
            if(map.get(item)==0){
                continue;
            }
            String kl = ""+item.charAt(1)+item.charAt(0);
            if(item.charAt(1)==item.charAt(0)){
                cn=cn+map.get(item)/2;
                if(map.get(item)%2!=0){
                    r1++;
                }
                map.put(item, 0);
            }
            if(map.containsKey(kl)){
                int r = map.get(kl);
                int e = map.get(item);
                map.put(item, 0);
                map.put(kl,0);
                cn+=Math.min(r,e);
            }
        }
        //System.out.println(words.length);
        if(r1>=1){
            r1=1;
        }
        return r1*2+cn*4;
        
    }
}