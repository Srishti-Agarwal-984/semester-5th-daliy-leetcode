// Last updated: 11/21/2025, 2:10:31 PM
class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Integer, int[]> m = new HashMap<>();
        m.put(0, new int[26]);
        m.get(0)[s.charAt(0)-'a']++;
        for(int i=1; i<s.length(); i++){
            m.put(i, Arrays.copyOf(m.get(i-1), 26));
            m.get(i)[s.charAt(i)-'a']++;
        }
        Map<Character,List<Integer>> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.get(s.charAt(i)).set(1,i);
            }
            else{
                map.put(s.charAt(i), new ArrayList<>());
                map.get(s.charAt(i)).add(i);
                map.get(s.charAt(i)).add(i);
            }
        }
        int sum=0;
        for(char k: map.keySet()){
            int a = map.get(k).get(0);
            int b =  map.get(k).get(1);
            if((b-a)>=2){
                int c=0;
                for(int i=0; i<26; i++){
                    if(m.get(b-1)[i]-m.get(a)[i]>=1){
                        c++;
                        
                    }
                }
                sum+=c;
            }
            
        }
        return sum;

        
        
    }
}