// Last updated: 10/1/2025, 5:22:53 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        HashSet<String> st =new HashSet<>();
        int[] freq =  new int[26];
        for(int i=0; i<p.length(); i++){
            freq[p.charAt(i)-'a']++;
        }
        st.add(helper(freq));

        freq =  new int[26];

        for(int i=0; i<p.length()-1; i++){
            freq[s.charAt(i)-'a']++;
        }
        List<Integer> li= new ArrayList<>();
        for(int i=p.length()-1; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            String k=helper(freq);
            if(st.contains(k)){
                li.add(i-p.length()+1);
            }
            freq[s.charAt(i-p.length()+1)-'a']--;
        }
        return li;
    }
    public String  helper(int[] freq){
        StringBuilder sb = new StringBuilder();
        for(int i=0;  i<26; i++){
            sb.append(freq[i]+".");
        }
        return sb.toString();
    }
}