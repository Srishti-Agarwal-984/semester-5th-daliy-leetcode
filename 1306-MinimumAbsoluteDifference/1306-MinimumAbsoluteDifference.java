// Last updated: 7/31/2025, 5:31:41 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int y=1000000;
        for(int i=0; i<arr.length-1; i++){
            y=Math.min(y, Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){ 
            if(y==Math.abs(arr[i]-arr[i+1])){
                List<Integer> ans1 = new ArrayList<>();
                ans1.add(arr[i]);
                ans1.add(arr[i+1]);
                ans.add(ans1);
            }
            
        }
        return ans;


        
    }
}