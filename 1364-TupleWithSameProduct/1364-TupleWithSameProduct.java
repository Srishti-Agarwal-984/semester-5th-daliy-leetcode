// Last updated: 7/31/2025, 5:31:30 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        if(nums.length<4){
            return 0;
        }
        int c=0;
        // Arrays.sort(nums);
        // int[] ar = new int[(nums[nums.length-1]*nums[nums.length-2])+1];
       ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                ar.add((nums[i]*nums[j]));
            }
        }
        Collections.sort(ar);
        // for(int i=0; i<)
        ArrayList<Integer> ar1 = new ArrayList<>();
        int u=1;
        int j = 0;

        while (j < ar.size()) {
            int count = 1;
            int val = ar.get(j);
            j++;

            while (j < ar.size() && ar.get(j).equals(val)) { 
                count++;
                j++;
            }

            //result.add(val);
            if(count>=2){
                ar1.add(count);

            }
            
        }
        for(int i=0; i<ar1.size(); i++){
            int p= (ar1.get(i)*(ar1.get(i)-1))/2;
            c=c+(p*8);
        }
        return c; 
    }
    
}