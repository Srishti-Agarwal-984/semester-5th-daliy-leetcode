// Last updated: 7/31/2025, 5:28:10 PM
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] a = new int[words.length];
        // int c=0;
        for(int i=0; i<words.length; i++){
            if("aeiou".indexOf(words[i].charAt(0))>=0 && "aeiou".indexOf(words[i].charAt(words[i].length()-1))>=0){
                a[i]++;
            }
            if(i==0){
                continue;
            }
            a[i]=a[i]+a[i-1];
        }
        int[] a1 = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            // int c=0;
            if(queries[i][0]==0){
                a1[i]=a[queries[i][1]];
            }
            else{
                a1[i]=a[queries[i][1]]-a[queries[i][0]];
                if(a[queries[i][0]]!=a[queries[i][0]-1]){
                    a1[i]=a1[i]+1;
                }
            }
        }
        return a1;

        
    }
}