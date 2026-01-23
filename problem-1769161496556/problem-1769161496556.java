// Last updated: 1/23/2026, 3:14:56 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if(Math.abs(word1.length()-word2.length())>=1){
4            return false;
5        }
6        int[] arr = new int[26];
7        int[] arr2 = new int[26];
8        for(int i=0; i<word1.length(); i++){
9            arr[word1.charAt(i)-'a']++;
10        }
11        for(int i=0; i<word2.length(); i++){
12            arr2[word2.charAt(i)-'a']++;
13        }
14        for(int i=0; i<26; i++){
15            if(arr[i]==0 && arr2[i]!=0){
16                return false;
17            }
18            if(arr[i]!=0 && arr2[i]==0){
19                return false;
20            }
21        }
22        Arrays.sort(arr);
23        Arrays.sort(arr2);
24        for(int i=0; i<26; i++){
25            if(arr[i]!=arr2[i]){
26                return false;
27            }
28        }
29        return true;
30        
31    }
32}