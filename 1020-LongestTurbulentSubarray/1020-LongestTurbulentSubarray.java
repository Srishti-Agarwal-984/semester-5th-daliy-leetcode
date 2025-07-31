// Last updated: 7/31/2025, 5:32:22 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length==1){
            return 1;
        }
        int ans=1, in=1,de=1, prev = arr[0];
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            if(curr<prev){
                de = in+1;
                in=1;
                ans = Math.max(ans, de);
            }
            else if(curr>prev){
                in=de+1;
                de=1;
                ans = Math.max(ans,in);
            }
            else{
                in=1;
                de=1;
            }
            prev=curr;
            
            
        }
        
        return ans;
        
    }
}