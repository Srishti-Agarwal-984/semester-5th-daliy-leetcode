// Last updated: 11/8/2025, 7:53:28 AM
class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        if(nums[0]==1){
            return 0;
        }
        Arrays.sort(numsDivide);
        int a = numsDivide[0];
        for(int i=1; i<numsDivide.length; i++){
            a = gcd(a, numsDivide[i]);

        }
        int c=0;
        for(int el: nums){
            if(a%el==0){
                return c;
            }
            c++;
        }
        return -1;
        
    }
    public int gcd(int a , int b){
        return (b == 0) ? a : gcd(b,a%b);
    }
}