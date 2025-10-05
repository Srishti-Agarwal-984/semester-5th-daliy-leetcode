// Last updated: 10/5/2025, 9:28:26 PM
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq =new int[26];
        int[] freq1 =new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            
            while(st.size()>0 && st.peek()>s.charAt(i) && freq[st.peek()-'a']>=1&& freq1[s.charAt(i)-'a']<=0){
                freq1[st.pop()-'a']--;
            }
            if(st.size()==0){
                st.add(s.charAt(i)); 
                freq1[s.charAt(i)-'a']++;
            }
            if(st.size()>0 && st.peek()!=s.charAt(i)&& freq1[s.charAt(i)-'a']<=0 ){
                st.add(s.charAt(i));
                freq1[s.charAt(i)-'a']++;
            }
            freq[s.charAt(i)-'a']--;

        }
        StringBuilder sb =new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}