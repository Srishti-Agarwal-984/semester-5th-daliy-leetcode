// Last updated: 7/31/2025, 5:33:47 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] b = ans(s1);

        for(int i=0; i<s2.length()-s1.length()+1; i++){
            if(Arrays.equals(ans(s2.substring(i,i+s1.length())),b)){
                return true;
            }

        }
        return false;
        
    }
    public static int[] ans(String u){
        int[] a = new int[26];
        for(int i=0; i<u.length(); i++){
            a[u.charAt(i)-'a']++;
        }
        return a;
        
    }
}