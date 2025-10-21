// Last updated: 10/21/2025, 5:16:41 PM
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        HashMap<Integer, Integer> map = new  HashMap<>();
        for(int el:nums){
            map.put(el, map.getOrDefault(el,0)+1);
        }
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i]-k;
            arr[i][1]=nums[i]+k;
        }
        int[] aq = new int[200002];
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        for(int i=0; i<nums.length;i++){
            int min= Math.max(0,arr[i][0]);
            aq[min]++;
            aq[arr[i][1]+1]--;

        }
        int r1 = map.getOrDefault(0,0);
        int b1= aq[0]-r1;
        int ans = r1+Math.min(numOperations,b1);
        for(int i=1; i<200002; i++){
            int r = map.getOrDefault(i,0);
            aq[i]+=aq[i-1];
            int b= aq[i]-r;
            int c = r+Math.min(numOperations,b);
            ans=Math.max(ans, c);

        }
        return ans;

        
    }

}