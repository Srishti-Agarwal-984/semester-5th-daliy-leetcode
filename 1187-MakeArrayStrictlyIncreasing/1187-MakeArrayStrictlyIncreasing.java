// Last updated: 10/10/2025, 4:33:17 PM
class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        map.clear();
        int result = helper(arr1,arr2,0,Integer.MIN_VALUE);
        return (result >= Integer.MAX_VALUE/2) ? -1 : result;
    }
    public int helper(int[] arr1, int[] arr2, int idx, int prev){
        if(idx >= arr1.length){
            return 0;
        }
        String key = idx+"-"+prev;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int result1 = Integer.MAX_VALUE/2;
        int result2 = Integer.MAX_VALUE/2;
        if(arr1[idx] > prev){
            result1 = helper(arr1,arr2,idx+1,arr1[idx]);
        }
        int ll = upper_bound(arr2,prev);
        if(ll < arr2.length){
            result2 = 1+helper(arr1,arr2,idx+1,arr2[ll]);
        }
        int res = Math.min(result1,result2);
        map.put(key,res);
        return res;

    }
    public int upper_bound(int[] arr, int prev){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] <= prev){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return st;
    }
}