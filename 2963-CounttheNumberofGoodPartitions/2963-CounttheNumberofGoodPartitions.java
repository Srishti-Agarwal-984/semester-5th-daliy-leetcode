// Last updated: 10/16/2025, 6:57:32 PM
class Solution {
    int mod = 1000000007;
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[1]=i;
            }
            else{
                map.put(nums[i], new int[2]);
                map.get(nums[i])[0]=i;
                map.get(nums[i])[1]=i;

            }
        }
        Pair[] arr = new Pair[map.size()];
        int i=0;
        for(int el: map.keySet()){
            arr[i]=new Pair(map.get(el)[0], map.get(el)[1]);
            i++;
        }
        Arrays.sort(arr, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return p1.st-p2.st;
            }
        });
        int n=1;
        int s = arr[0].en;
        for(i=1; i<arr.length; i++){
            if(arr[i].st>=s){
                s = arr[i].en;
                n++;
            }
            else{
                s = Math.max(s, arr[i].en);
            }
        }



        
        
        //System.out.println(n);
        int ans = helper(n-1, 2);
        return ans;
        
    }
    public int helper(int n, int a){
        if(n==0){
            return 1;
        }
        int p = (n-1+1)/2;
        int q = (n-1)/2;
        int ans = helper(p,2)%mod;
        int ans1 = helper(q,2)%mod;
        long f = (ans1*2)%mod;
        f=(f*ans)%mod;

        return (int)f;
    }
    class Pair{

        int st;
        int en;
        public Pair(int st,int en){

            this.st=st;
            this.en=en;
        }
    }

}