// Last updated: 7/31/2025, 5:31:56 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ar = new ArrayList<>();
        digits(low,high,0,ar);
        Collections.sort(ar);
        return ar;
        
    }
    public static void digits(int low , int high, int n,List<Integer> ar){
        if(n>=low && n<=high){
            ar.add(n);
           // return;
        }
        // if(idx==10){
        //     idx=1;
        //     return;
        // }
        if(n>high){
            return;
        }
        for(int i=1; i<=9; i++){
            if(n==0 || n%10-i==-1){
                digits(low,high,n*10+i,ar);
            }
        }
    }
}