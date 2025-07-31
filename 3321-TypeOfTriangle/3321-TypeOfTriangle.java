// Last updated: 7/31/2025, 5:27:35 PM
class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b=nums[1], c = nums[2];
        if(a==b && b==c){
            return "equilateral";
        }
        else if(a+b<=c || a+c<=b ||b+c<=a ){
            return "none";
            
        }
        else if(a==b|| a==c|| b==c){
            return "isosceles";
        }
        else{
            return "scalene";
        }
    }
}