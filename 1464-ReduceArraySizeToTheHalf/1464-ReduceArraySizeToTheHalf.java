// Last updated: 7/31/2025, 5:31:14 PM
class Solution {
    public int minSetSize(int[] arr) {
        int[] freq = new int[100001];
        for(int i=0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        Arrays.sort(freq);
        int n = arr.length;
        int sum=0;
        int cn=0;
        for(int i=freq.length-1; i>=0; i--){
            sum+=freq[i];
            cn++;
            if(sum>=(n/2)){
                break;
            }

        }
        return cn;

        
    }
}