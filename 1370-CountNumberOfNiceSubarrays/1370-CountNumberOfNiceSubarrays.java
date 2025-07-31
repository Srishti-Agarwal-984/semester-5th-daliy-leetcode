// Last updated: 7/31/2025, 5:31:28 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> oi = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]%2;
            if(nums[i]%2!=0){
                oi.add(i);
            }
        }
        int ans =0;
        int i=0 ,si=0;
        int cn=0;
        while(i<nums.length){
            if(nums[i]==1){
                int r = oi.indexOf(i);
                oi.remove(r);
                cn++;
            }
            while(cn>=k && si<=i){
                if(oi.size()==0){
                    ans = ans+nums.length-i;
                }
                else{
                    ans = ans+oi.get(0)-i;

                }
                
                if(nums[si]==1){
                    cn--;
                }
                si++;
                
            }
            i++;
            
        }
        return ans;
        
    }
}