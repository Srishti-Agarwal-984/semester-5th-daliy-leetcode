// Last updated: 7/31/2025, 5:31:35 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int p= (int)(Math.pow(10,5));
        int [] a = new int[p+1];
        int [] b = new int[p+1];
        for(int i=0; i<matches.length; i++){
            a[matches[i][0]]++;
            b[matches[i][1]]++;
        }
        ArrayList<List<Integer>> df = new ArrayList<List<Integer>>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        ArrayList<Integer> f = new ArrayList<Integer>();
        for(int i=0; i<p+1; i++){
            if(a[i]>0 && b[i]==0){
                d.add(i);
            }
            if(b[i]==1){
                f.add(i);
            }
        }
        df.add(d);
        df.add(f);
        return df;

        
    }
}