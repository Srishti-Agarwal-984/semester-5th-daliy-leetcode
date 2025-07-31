// Last updated: 7/31/2025, 5:34:26 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ab = new ArrayList<Integer>();
        int  l=1, p=nums.length;
        
        if(nums[p-1]>p){
            p=nums[nums.length-1];
        }
        while(l<=p){
            int i=0, k= nums.length-1, c=0;
            while(i<=k){
                int mid = (i+k)/2;
                if(nums[mid]==l){
                    c=1;
                    break;
                }
                else if(nums[mid]>l){
                    k=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            if(c==0){
                ab.add(l);
            }
            l++;
        }
        return ab;
    }
}