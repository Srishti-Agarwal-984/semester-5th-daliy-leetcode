// Last updated: 7/31/2025, 5:27:53 PM
class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        for(int i=0; i<nums.size(); i++){
            int r = nums.size();
            int e = i+1;
            while(e<=r){
                int mid = e+(r-e)/2;
                if( mid<nums.size() && nums.get(mid)>nums.get(i)){
                    nums.remove(mid);
                    nums.remove(i);
                    i=i-1;
                    break;
                }
                else{
                    e=mid+1;
                }
            }
            
        }
        return nums.size();

        
    }
}