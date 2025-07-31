// Last updated: 7/31/2025, 5:27:54 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int [] ar = new int[nums.size()];
        for(int i=0; i<nums.size(); i++){
            ar[i] = nums.get(i);
            
        }
        Arrays.sort(ar);
        int c=0; 
        for(int i=0; i<nums.size()-1; i++){
            int ans = 0;
            int j=i+1;
            int k= nums.size()-1;
            while(j<=k){
                int mid = (j+k)/2;
                if(ar[i]+ar[mid]<target){
                    ans= mid-i;
                    j=mid+1;
                }
                else{
                    k=mid-1;
                }
            }
            c=c+ans;
        }
        return c;
        
    }
}