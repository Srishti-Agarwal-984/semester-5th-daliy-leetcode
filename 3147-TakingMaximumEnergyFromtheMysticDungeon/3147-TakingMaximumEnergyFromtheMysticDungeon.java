// Last updated: 10/12/2025, 7:39:24 AM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        //k=k+1;
        int[] ans = new int[k];
        Arrays.fill(ans, -1001);
        for(int i=0; i<energy.length; i++){
            ans[i%k]=Math.max(ans[i%k]+energy[i], energy[i]);
        }
        int a = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            a=Math.max(a,ans[i]);
        }
        return a;
        
    }
}