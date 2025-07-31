// Last updated: 7/31/2025, 5:30:53 PM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] a = sentence.split(" ");
        // System.out.print(a[0]);
        // return 1;
        int n=searchWord.length()-1 ;
        int c=0;
        for(int i=0; i<a.length; i++){
            if(searchWord.length()<=a[i].length()){
                String s = a[i].substring(0,n+1);
                // System.out.println(s);
                if (s.equals(searchWord)) { // Direct equality check
                    c=i+1;
                    break;
                }
            }
            if(c>=1){
                break;
            }
        }
        if(c>=1){
            return c;
        }
        return -1;
        
    }
}