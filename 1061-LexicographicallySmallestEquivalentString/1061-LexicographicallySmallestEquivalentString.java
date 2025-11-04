// Last updated: 11/4/2025, 10:17:52 PM
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        int m = baseStr.length();
        HashSet<Character>[] map = (HashSet<Character>[]) new HashSet[26];
        for(char ch = 'a'; ch <='z'; ch++){
            map[ch-'a'] = new HashSet<>();
        }
        for(int i = 0; i<n; i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            map[a-'a'].add(b);
            map[b-'a'].add(a);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++){
            HashSet<Character> st = new HashSet<>();
            char min = dfs(map,st,baseStr.charAt(i));
            sb.append(min);
        }
        return sb.toString();
    }
    public char dfs(HashSet<Character>[] map, HashSet<Character> st, char ch){
        char min = ch;
        st.add(min);
        for(char nbrs : map[ch-'a']){
            if(st.contains(nbrs)){
                continue;
            }
            char t = dfs(map,st,nbrs);
            if(t < min){
                min = t;
            }
        }
        return min;
    }
}