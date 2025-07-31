// Last updated: 7/31/2025, 5:32:46 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int i=0, k=people.length-1;
        while(i<=k){
            int y= people[i]+ people[k];
            if(y<=limit){
                ans++;
                k--;
                i++;
            }
            else if(y>limit){
                ans++;
                k--;
            }    
        }
        return ans;
       
        
    }
}