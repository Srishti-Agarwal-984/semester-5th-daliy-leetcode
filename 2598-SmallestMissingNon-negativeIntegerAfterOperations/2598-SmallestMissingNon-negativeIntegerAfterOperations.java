// Last updated: 10/16/2025, 11:04:36 PM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int el=nums[i];
            if(el<0){
                int a= el*-1;

                a=(a+value-1)/value;
                el=a*value+el; 
                //System.out.println(el); 
            }
            map.put(el%value, map.getOrDefault(el%value,0)+1);
            
        }
        int mex = 0;
        while(map.containsKey(mex % value) && map.get(mex%value) > 0){
            map.put(mex%value,map.get(mex%value)-1);
            mex++;
        }
        return mex;
    }
}