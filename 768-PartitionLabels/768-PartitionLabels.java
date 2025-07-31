// Last updated: 7/31/2025, 5:33:10 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        boolean[] ans1 = new boolean[26];
        List<Integer> as = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++){
            int u = s.charAt(i)-97;
            if(ans1[u]==false){
                array1[u]=i;
                ans1[u]=true;
            }
            array2[u]=i;
        }
        int o=0;
        int i=0, l= s.length()-1;
        int r =array2[s.charAt(i)-97];
        while(i<=l){
            if(array1[s.charAt(i)-97]>r){
                as.add(i-o);
                o=i;
                r=array2[s.charAt(i)-97];
            }
            r=Math.max(r,array2[s.charAt(i)-97]);
            i++;
        }
        as.add(i-o);
        return as;
        



        
    }
}