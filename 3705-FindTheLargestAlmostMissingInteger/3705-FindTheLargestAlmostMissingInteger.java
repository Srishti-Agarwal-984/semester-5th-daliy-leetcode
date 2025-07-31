// Last updated: 7/31/2025, 5:26:33 PM
class Solution {
    public int largestInteger(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        int c1=0, c2=0;
        int u=nums[0], u1=nums[nums.length-1];
        if(nums.length!=k && k!=1){
            for(int i=1; i<nums.length; i++){
                if(u==nums[i]){
                    c1=1;
                }
            }
            for(int i=0; i<nums.length-1; i++){
                if(u1==nums[i]){
                    c2=1;
                }
            }
            if(c2==0){
                if(c1==0){
                    return Math.max(u,u1);
                }
                return u1;
            }
            if(c1==0){
                if(c2==0){
                    return Math.max(u,u1);
                }
                return u;
            }
            return -1; 
        }
        c1=0;
        for(int i=0; i<nums.length; i++){
            c1=Math.max(c1,nums[i]);
        }
        Arrays.sort(nums);
        if(k==1){
            int e=-1,i=0;
            int c=0;
            for(i=0; i<nums.length-1; i++){
                if(nums[i]==nums[i+1]){
                    c++;
                }
                else{
                    if(c==0){
                        e=Math.max(e,nums[i]);
                    }
                    c=0;
                }
            }
            if(c==0){
                e=Math.max(e,nums[i]);
            }
            return e;
            
        }
        return c1;
        
        
        
    }
}