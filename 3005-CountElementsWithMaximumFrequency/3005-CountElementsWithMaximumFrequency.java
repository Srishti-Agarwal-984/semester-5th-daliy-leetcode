// Last updated: 9/22/2025, 4:50:14 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq  = new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int c=0, ans=0;
        for(int i=0; i<=100; i++){
            if(freq[i]>c){
                c=freq[i];
                ans=0;
                ans+=freq[i];
            }
            else if(freq[i]==c){
                ans+=freq[i];
            }
        }
        return ans;

    }
}