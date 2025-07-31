// Last updated: 7/31/2025, 5:34:09 PM
import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> ar = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            while(!ar.isEmpty() && nums[i]>nums[ar.peek()]){
                ans[ar.pop()]=nums[i];
            }
            ar.push(i);
        }
        while(!ar.isEmpty()){
            int c=0,l=0;
            while(l<ar.peek()){
                if(nums[l]>nums[ar.peek()]){
                    ans[ar.pop()]=nums[l];
                    c=1;
                    break;
                }
                l++;
            }
            if(c==0){
                ans[ar.pop()]=-1;
            }
        }
        return ans;

        
    }
}