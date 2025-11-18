// Last updated: 11/18/2025, 5:02:11 PM
class Solution {
    //HashMap<Integer, HashSet>
    public int lenLongestFibSubseq(int[] arr) {
        int ans=2;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int r = helper(arr, i, j);
                ans=Math.max(ans,helper(arr, i, j)+2);
            }
        }
        return ans>2? ans:0;
        
    }
    public int helper(int[] arr, int i, int j){
        if(j>=arr.length){
            return 0;
        }
        int ans=0;
        long p =  arr[i]+arr[j];
        int e= check(p, arr, j+1);
        if(e>0){
            ans+=1+helper(arr,j, e);

        }
        return ans;
    }
    public int check(long p, int[] arr, int si){
       // int en=arr.length();
       int en = arr.length-1;
       int c=0;
        
        while(si<=en){
            int mid=(si+en)/2;
            if(arr[mid]==p){
                return mid;
            }
            else if(arr[mid]>p){
                en=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return -1;

    }
}