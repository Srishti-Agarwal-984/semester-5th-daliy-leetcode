// Last updated: 9/17/2025, 12:27:17 AM
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int b: arr1){
            String l= String.valueOf(b);
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<l.length(); i++){
                sb.append(l.charAt(i));
                set.add(sb.toString());
            }
        }
        int ans=0;
        for(int b: arr2){
            String l= String.valueOf(b);
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<l.length(); i++){
                sb.append(l.charAt(i));
                //System.out.println(s);
                if(set.contains(sb.toString())){
                    ans=Math.max(ans, sb.length());
                }
                else{
                    break;
                }
            }
        }
        return ans;

        
    }
}