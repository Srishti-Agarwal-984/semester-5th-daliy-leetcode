// Last updated: 1/31/2026, 3:22:47 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        //Arrays.sort(letters);
4        for(char ch: letters){
5            if(ch>target){
6                return ch;
7
8            }
9        }
10        return letters[0];
11        
12    }
13}