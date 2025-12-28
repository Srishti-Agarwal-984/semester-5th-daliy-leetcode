// Last updated: 12/28/2025, 2:21:06 PM
1   class Solution {	 
2   public List<String> findAllConcatenatedWordsInADict(String[] words) {
3   
4    //sort the array in asc order of word length, since longer words are formed by shorter words.
5    Arrays.sort(words, (a,b) -> a.length() - b.length());
6    
7	List<String> result = new ArrayList<>();
8    
9    //list of shorter words 
10    HashSet<String> preWords = new HashSet<>();
11    
12    for(int i=0; i< words.length; i++){
13        //Word Break-I problem.
14        if(wordBreak(words[i], preWords)) result.add(words[i]);
15        preWords.add(words[i]);
16    }
17    return result;
18   }
19   
20   private boolean wordBreak(String s, HashSet<String> preWords){
21    if(preWords.isEmpty()) return false;
22    
23    boolean[] dp = new boolean[s.length() + 1];
24    dp[0] = true;
25    
26    for(int i = 1; i <= s.length(); i++){
27        for(int j = 0; j < i; j++){
28            if(dp[j] && preWords.contains(s.substring(j, i))){
29                dp[i] = true;
30                break;
31            }
32        }
33    }
34    return dp[s.length()];
35   }
36   }
37   
38   