// Last updated: 7/31/2025, 5:37:33 PM
class Solution {
    public String minWindow(String s, String t) {
        int ans = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int si=0,i=0;
        int st=-1;
        int c=0;
        while(i<s.length()){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,-1)-1);
            if(map.get(ch)>=0){
                c++;
            }
            while(c==t.length()){
                if(i-si+1<ans){
                    st = si;
                    ans = i-si+1;
                }
                char l = s.charAt(si);
                map.put(l,map.getOrDefault(l,-1)+1);
                if(map.get(l) > 0){
                    c--;
                }
                si++;
            }
            i++;
        }
        if(st==-1){
            return "";
        }
        return s.substring(st, st+ans);
        
    }
}