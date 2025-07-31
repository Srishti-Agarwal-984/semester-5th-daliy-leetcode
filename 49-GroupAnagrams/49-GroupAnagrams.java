// Last updated: 7/31/2025, 5:38:02 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] ad = new int[strs.length][26];
        boolean[] gh = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            int[] a = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                a[strs[i].charAt(j)-'a']++;
            }
            ad[i]=a;
        }
        List<List<String>> ans =new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            if(gh[i]==true){
                continue;
            }
            gh[i]=true;
            List<String> ans1 = new ArrayList<>();
            ans1.add(strs[i]);
            for(int j=i+1; j<strs.length; j++){
                if(Arrays.equals(ad[i], ad[j])){
                    ans1.add(strs[j]);
                    gh[j]=true;
                }
            }
            ans.add(ans1);
        }
        return ans;

        

        
    }
}