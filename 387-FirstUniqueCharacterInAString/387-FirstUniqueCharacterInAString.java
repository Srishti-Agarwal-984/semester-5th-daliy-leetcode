// Last updated: 7/31/2025, 5:34:51 PM
class Solution {
    public int firstUniqChar(String s) {
        int a= -1;
        int [] arr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            int d = s.charAt(i)-'a';
            arr[d]++;
        }
        int c=0;
        for(int i=0; i<s.length(); i++){
            int d = s.charAt(i)-'a';
            if(arr[d]==1){
                return i;
                
            }
        }
        return -1;

        
    }
}