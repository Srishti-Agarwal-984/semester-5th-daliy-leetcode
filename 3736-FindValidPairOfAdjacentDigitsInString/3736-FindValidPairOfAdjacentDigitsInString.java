// Last updated: 7/31/2025, 5:26:22 PM
class Solution {
    public String findValidPair(String s) {
        int[] arr = new int[10];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'0']++;
        }
        String a = "";
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                int y= s.charAt(i)-'0';
                int x = s.charAt(i+1)-'0';
                if(arr[y]==y && arr[x]==x){
                    a=a+s.charAt(i)+s.charAt(i+1);
                    break;
                }
            }
        }
        return a;
        
        
    }
}