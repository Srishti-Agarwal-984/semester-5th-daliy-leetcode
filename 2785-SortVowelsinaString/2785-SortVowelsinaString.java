// Last updated: 9/12/2025, 4:55:57 AM
class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        
        // Convert string to Character[]
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            if(vowels.indexOf(s.charAt(i))>=0){
                pq.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                sb.append(pq.poll());
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}