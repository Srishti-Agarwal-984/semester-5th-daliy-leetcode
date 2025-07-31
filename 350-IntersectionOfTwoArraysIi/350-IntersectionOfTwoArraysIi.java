// Last updated: 7/31/2025, 5:35:02 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int[] y = new int[nums1[nums1.length-1]+1];
        for(int i=0; i<nums1.length; i++){
            y[nums1[i]]++;
        }
        ArrayList<Integer> as = new ArrayList<Integer>();
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]<y.length && y[nums2[i]]>=1){
                as.add(nums2[i]);
                y[nums2[i]]--;
            }
        }
        int [] p = new int[as.size()];
        for(int i=0; i<p.length; i++){
            p[i] = as.get(i);
        }

        return p;

        
    }
}