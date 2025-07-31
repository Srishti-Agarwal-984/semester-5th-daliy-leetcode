// Last updated: 7/31/2025, 5:27:57 PM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int c=0;
        int[] freq = new int[2001];
        for(int i=0; i<nums.length; i++){
            if(freq[nums[i]]==0){
                c++;
                freq[nums[i]]++;
            }
        }
        //System.out.println(c);
        int u=0;
        int r=0;
        int ans =0;
        List<Integer> ar = new ArrayList<>();
        while(r<nums.length){
            if(ar.contains(nums[r])==false){
                u++;
            }
            ar.add(nums[r]);
            while(u>=c){
                ans+=nums.length-r;
                int a = ar.remove(0);
                if(ar.contains(a)==false){
                    u--;
                }
            }
            r++;
        }
        return ans;

        
    }
}