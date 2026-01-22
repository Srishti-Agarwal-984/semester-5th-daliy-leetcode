// Last updated: 1/23/2026, 5:23:07 AM
1class Solution {
2    
3    public void insertAndRemove(Map<Character, Integer> mp, char toInsert, char toRemove){  // made this helper fxn for easy removal from hashmap
4        mp.put(toInsert, mp.getOrDefault(toInsert, 0) + 1); // increment freq for char to be inserted
5        mp.put(toRemove, mp.getOrDefault(toRemove, 0) - 1); // decrement freq for char to be removed
6        if(mp.get(toRemove)==0) mp.remove(toRemove); // if freq of that char reaches zero, then remove the key from hashmap
7
8    }
9    
10    public boolean isItPossible(String word1, String word2) {
11        Map<Character, Integer> mp1 = new HashMap<>();
12        Map<Character, Integer> mp2 = new HashMap<>();
13        
14        for (char w1: word1.toCharArray()) {   // store freq of chars in word1 in mp1
15            mp1.put(w1, mp1.getOrDefault(w1, 0) + 1);
16        }
17        for (char w2: word2.toCharArray()) {   // store freq of chars in word2 in mp2
18            mp2.put(w2, mp2.getOrDefault(w2, 0) + 1);
19        }
20
21        
22        for(char c1='a'; c1<='z'; c1++){
23            for(char c2='a'; c2<='z'; c2++){
24
25                if(!mp1.containsKey(c1) || !mp2.containsKey(c2)) continue;  // if any of the char is not present then skip
26				
27                insertAndRemove(mp1, c2, c1); // insert c2 to word1 and remove c1 from word1
28                insertAndRemove(mp2, c1, c2); // insert c1 to word2 and remove c2 from word2
29                
30                if(mp1.size()==mp2.size()) return true;  // if size of both maps are equal then possible return true
31				
32                // reset back the maps
33                insertAndRemove(mp1, c1, c2); // insert c1 back to word1 and remove c2 from word1              
34                insertAndRemove(mp2, c2, c1); // insert c2 back to word2 and remove c1 from word2
35            }
36        }
37        
38        return false;
39    }
40}