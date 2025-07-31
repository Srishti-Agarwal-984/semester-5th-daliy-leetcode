// Last updated: 7/31/2025, 5:34:19 PM
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ans =0;
        for(int i=0; i<houses.length; i++){
            int si=0, en = heaters.length-1;
            int js = Integer.MAX_VALUE, jl =Integer.MAX_VALUE;
            while(si<=en){
                int mid = si+(en-si)/2;
                if(heaters[mid]==houses[i]){
                    js=0;
                    jl=0;
                    break;
                }
                else if(heaters[mid]<houses[i]) {
                    jl = Math.abs(houses[i] - heaters[mid]);
                    si=mid+1;
                
                }
                else{
                    js = Math.abs(houses[i] - heaters[mid]);
                    en = mid-1;

                }

            }
            ans=Math.max(ans, Math.min(js,jl));
        }
        return ans;
        
        
    }
}