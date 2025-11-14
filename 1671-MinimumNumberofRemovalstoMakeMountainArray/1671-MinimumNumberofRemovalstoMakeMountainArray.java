// Last updated: 11/14/2025, 8:34:57 PM
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=1; i< nums.length-1; i++){
            int r =checker(nums,i, nums.length-1);
            int l= helper(nums, 0, i);
            if(r>=2 && l>=2){
                ans=Math.min(ans,nums.length-(r+l-1));

            }
            
        }
        return ans;
    }
    public int helper(int[] a, int si, int en){
        List<Integer> li = new ArrayList<>();
        li.add(a[si]);
        for(int i=si+1; i<=en; i++){
            if(li.get(li.size()-1)<a[i]){
                li.add(a[i]);
            }
            else{
                int j=fun(li,a[i]);
                li.set(j,a[i]);
            }

        }
        return li.size();
    }
    public int checker(int[] a, int si, int en){
        List<Integer> li = new ArrayList<>();
        li.add(a[en]);
        for(int i=en-1; i>=si; i--){
            if(li.get(li.size()-1)<a[i]){
                li.add(a[i]);
            }
            else{
                int j=fun(li,a[i]);
                li.set(j,a[i]);
            }

        }
        return li.size();
    }
    public int fun(List<Integer> li,int b){
        int ans=0;
        int si=0, en=li.size()-1;
        while(si<=en){
            int mid = si+(en-si)/2;
            if(li.get(mid)>=b){
                ans=mid;
                en=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
}