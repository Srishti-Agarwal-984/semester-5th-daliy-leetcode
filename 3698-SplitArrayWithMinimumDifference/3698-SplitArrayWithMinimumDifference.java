// Last updated: 9/28/2025, 10:15:24 AM
class Solution {
    public long splitArray(int[] nums) {
        int i = 1, n = nums.length;
        long suml = nums[0];
        long sumr = 0;
        while(i<n && nums[i]>nums[i-1]){
            suml += nums[i];
            i++;
        }

        if(i==n) return Math.abs(suml-nums[n-1]-nums[n-1]);
        
        // System.out.println(i);
        int pivot = nums[i]==nums[i-1]?0:nums[i-1];
        sumr = nums[i];
        i+=1;

        while(i<n && nums[i]<nums[i-1]){
            sumr+=nums[i];
            i++;
        }

        if(i!=n) return -1;

        if(suml<=sumr) return sumr-suml;
        else {
            if(suml-sumr-2*pivot>0) return suml-sumr-2*pivot;
            else return Math.min(suml-sumr,Math.abs(suml-sumr-2*pivot));
        }
    }
}