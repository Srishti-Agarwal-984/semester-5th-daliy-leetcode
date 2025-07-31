// Last updated: 7/31/2025, 5:33:48 PM
class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] df1 = new boolean[nums.length];
        int i=0;
        int l=a(i,nums,df1);
        i=1;
        while(i<nums.length){
            l=Math.max(l,a(i,nums, df1));
            i++;
            if(l==nums.length){
                return l;
            }
        }
        return l;
        
    }
    
    public static int a(int g, int[]nums, boolean[] df1){
        // boolean[] df = new boolean[nums.length];
        int hj =0;
        while(true){
            // if(df[nums[g]]==false &&
            if(df1[nums[g]]==true){
                // df[nums[g]]=true;
                break;
                
            }
            df1[nums[g]]=true;
            g=nums[g];
            hj++;
        }
        return hj;
    }
}