// Last updated: 7/31/2025, 5:26:48 PM
class Solution {
    public long validSubstringCount(String word1, String word2) {
        HashMap<Character, Long> map =  new HashMap<>();

        for(int i=0; i<word2.length(); i++){
            map.put(word2.charAt(i), map.getOrDefault(word2.charAt(i),0L)+1);
        }
        long ans =0;
        int si=0, i=0, n= word1.length();
        int c=0;
        while(i<n){
            char ch = word1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0L)-1);
            if(map.get(ch)>=0){
                c++;
            }
            while(c==word2.length() && si<=i){
                ans+=n-i;
                //System.out.println(ans+" "+i);
                char l =  word1.charAt(si);
                map.put(l, map.getOrDefault(l,0L)+1);
                if(map.get(l)>=1){
                    c--;
                }
                si++;
            }
            i++;

        }
        return ans;

    }
}