// Last updated: 7/31/2025, 5:33:28 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> as = new ArrayList<Integer>();
        if(arr[0]>=x){
            for(int i=0; i<k; i++){
                as.add(arr[i]);
            }
            return as;
        }
        else if (arr[arr.length-1]<=x){
            for(int i=arr.length-k; i<arr.length; i++){
                as.add(arr[i]);
            }
            return as;

        }
        int i=0, l = arr.length-1, mn =0;
        while(i<=l){
            int mid = i+(l-i)/2;
            if(arr[mid]==x){
                as.add(x);
                mn=1;
                k--;
                break;
            }
            else if (arr[mid]>x){
                l=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int p = i+(l-i)/2;
        int y = p+1, d = p-1;
        if(mn==0){
            y=p;
        }
        while(y<arr.length && d>=0 && k!=0){
            int t = arr[y]-x;
            int q =  x-arr[d];
            if(q<t && k!=0){
                as.add(arr[d]);
                k--;
                d--;
            }
            if(t<q && k>0){
                as.add(arr[y]);
                k--;
                y++;
            }
            if(t==q && k>0){
                as.add(arr[d]);
                k=k-1;
                
               
                d--;
            }

        }
        if(k!=0){
            while(d>=0 && k>0){
                as.add(arr[d]);
                d--;
                k--;
            }
            while(y<arr.length && k>0){
                as.add(arr[y]);
                y++;
                k--;
            }
        }
        Collections.sort(as);
        return as;

        
        
    }
}