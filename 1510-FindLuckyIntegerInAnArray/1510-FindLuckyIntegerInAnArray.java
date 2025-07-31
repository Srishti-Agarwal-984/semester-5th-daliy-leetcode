// Last updated: 7/31/2025, 5:31:07 PM
class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        int max=-1;
        int i=0;
        for(i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
            else{
                if(c==arr[i]-1){
                    max=Math.max(max, arr[i]);
                }
                c=0;
            }
        }
        if(c==arr[i]-1){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
}