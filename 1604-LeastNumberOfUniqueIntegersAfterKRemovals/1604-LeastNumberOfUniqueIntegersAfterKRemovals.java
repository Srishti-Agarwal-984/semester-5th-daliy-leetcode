// Last updated: 7/31/2025, 5:30:47 PM
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        List<Integer> ar2= new ArrayList<>();
        int c=1;
        int i=0;
        for(; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
            else{
                ar2.add(c);
                c=1;
            }
        }
        ar2.add(c);
        Collections.sort(ar2);
        while(k>0){
            if(k>=ar2.get(0)){
                k=k-ar2.get(0);
                ar2.remove(0);
                continue;
            }
            k=0;
        }
        int p= ar2.size();
        return p;
        

        
    }
}