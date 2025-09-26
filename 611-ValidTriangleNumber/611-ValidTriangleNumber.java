// Last updated: 9/26/2025, 6:18:47 AM
class Solution {
    public int triangleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int a= nums[i];
            for(int j=i+1; j<nums.length; j++){
                int b= nums[j];
                for(int k=j+1; k<nums.length; k++){
                    int c= nums[k];
                    if(a+b<=c){
                        break;
                    }
                    if(a+b>c && a+c>b && b+c>a){
                        ans++;
                    }
                }
            }

        }
        return ans;
        
    }
}