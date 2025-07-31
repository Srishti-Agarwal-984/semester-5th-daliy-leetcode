// Last updated: 7/31/2025, 5:31:37 PM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for(int i=1; i<folder.length; i++){
            String df = ans.get(ans.size()-1);
            if(folder[i].indexOf(df)==0){
                int r = df.length();
                if(folder[i].charAt(r)!='/'){
                    ans.add(folder[i]);
                }
            }
            else{
                ans.add(folder[i]);
            }

        }
        return ans;
    }
}