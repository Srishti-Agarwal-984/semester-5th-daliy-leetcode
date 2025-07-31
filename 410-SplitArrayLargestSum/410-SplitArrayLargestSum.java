// Last updated: 7/31/2025, 5:34:41 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        long j=sum;
        long p= sum/k;
        long h=0,m=0;
        while(h<=sum){
            long mid = (h+sum)/2;
            if(isp(nums, mid, k)){
                m=mid;
                sum=mid-1;
            }
            else{
                h=mid+1;
            }
        }
        //j=j-(m*(k-1));
        return (int)(m);
    }
    public static boolean isp(int[] nums,long mid ,int k){
        int st=1;
		int readp=0, i=0;
		while(i<nums.length){
			if(readp+nums[i]<=mid){
				readp=readp+nums[i];
				i++;
			}
			else{
				st++;
				readp=0;
			}
			if(st>k){
				return false;
			}

		}
		return true;

    }
}