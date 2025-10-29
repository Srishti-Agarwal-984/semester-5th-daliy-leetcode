// Last updated: 10/29/2025, 11:38:47 AM
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        while(!sort(arr) && n>0){
            if(arr[n-1]!=n){
                int c=0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]==n){
                        ans.add(i+1);
                        c=i;
                    }
                }
                int si=0;
                while(si<=c){
                    int temp = arr[si];
                    arr[si]=arr[c];
                    arr[c]=temp;
                    c--;
                    si++;
                }
                ans.add(n);
                si=0;
                c=n-1;
                while(si<=c){
                    int temp = arr[si];
                    arr[si]=arr[c];
                    arr[c]=temp;
                    c--;
                    si++;
                }
            }
            n--;
        }
        return ans;
    }
    public boolean sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

}