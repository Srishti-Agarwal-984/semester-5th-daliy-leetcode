// Last updated: 7/31/2025, 5:31:31 PM
class Solution {
    static int ans=0;
    public int maxLength(List<String> arr) {
        int[][] ar = new int[arr.size()][26];
        boolean[] ae = new boolean[arr.size()];
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).length(); j++){
                ar[i][arr.get(i).charAt(j)-'a']++;
                if(ar[i][arr.get(i).charAt(j)-'a']>=2){
                    ae[i]=true;
                    break;
            
                }
            }
        }
        helper(arr, 0, "",ae);
        int r = ans;
        ans =0;
        return r;



        
    }
    public static void helper(List<String> arr, int indx, String jkl,boolean[] ae){
        ans=Math.max(ans, jkl.length());
        if(indx==arr.size()){
            return;
        }
        for(int i=indx; i<arr.size(); i++){
            if(check(arr.get(i) , jkl) && !ae[i]){
                helper(arr,  i+1, jkl+arr.get(i),ae);
            }
        }
    }
    public static boolean check(String h, String jkl ){
        if(jkl.length()==0){
            return true;
        }
        int si=0, en= h.length()-1;
        while(si<=en){
            if(jkl.indexOf(h.charAt(si))>=0 || jkl.indexOf(h.charAt(en))>=0){
                return false;
            }
            si++;
            en--;
        }
        return true;

    }

}