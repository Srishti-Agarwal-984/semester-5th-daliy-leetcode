// Last updated: 9/6/2025, 11:54:31 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> ar = new ArrayList<>();
        List<Integer> ar2 = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        int c=1;
        int j=0;
        for(j=0; j<nums.length-1; j++){
            if(nums[j]==nums[j+1]){
                c++;
            }
            else{
                ar.add(nums[j]);
                ar2.add(c);
                ar1.add(c);
                c=1;
            }
        }
        ar.add(nums[j]);
        ar2.add(c);
        ar1.add(c);
        Collections.sort(ar2);
        int l= ar2.size()-1;
        int[] pl= new int[k];
        int v=0;
        k=k-1;
        while(k>=0){
            int g=ar1.indexOf(ar2.get(l));

            pl[k]=ar.get(g);
            System.out.println(ar2);
            ar2.remove(l);
            ar1.remove(g);
            ar.remove(g);
            //System.out.println(ar2);
            l=l-1;
            k--;
        }
        return pl;



        
        
    }
}