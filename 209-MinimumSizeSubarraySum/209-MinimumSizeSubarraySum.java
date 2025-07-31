// Last updated: 7/31/2025, 5:35:53 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=Integer.MAX_VALUE;
        int p=0;
        int i=0, l= nums.length;
        int g=0, count= 0, si=0;
        for(i=0; i<nums.length; i++){
            p=p+nums[i];
        }
        if(p<target){
            return 0;
        }
        i=0;
        while(i<l){
            
            g=g+nums[i];
            
            while(g>=target && si<=i){
                sum = Math.min(sum, i-si+1);
                System.out.println(sum);
                g=g-nums[si];
                si++;
            }
            
            i++;
        }
        return sum;
        
    }
}