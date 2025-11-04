// Last updated: 11/4/2025, 6:15:50 AM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] ans=new int[nums.length-k+1];
        for(int j=0; j<=nums.length-k; j++){
            Pair[] freq = new Pair[51];
            for(int i=0; i<51; i++){
                freq[i]=new Pair(i,0);
            }
            for(int i=j; i<j+k; i++){
                freq[nums[i]] = new Pair(nums[i], freq[nums[i]].count+1);
            }
            Arrays.sort(freq, new Comparator<Pair>(){
                @Override
                public int compare(Pair p1, Pair p2){
                    if(p1.count==p2.count){
                        return p2.key-p1.key;
                    }
                    return p2.count-p1.count;
                }
            });
            int d=x;
            for(int i=0; i<51; i++){
                if(freq[i].count>0 && d>0){
                    ans[j]+=freq[i].count*freq[i].key;
                    d--;
                }
                else{
                    break;
                }
            }

        }
        return ans;
        


        
    }
    class Pair{
        int key;
        int count;
        public Pair(int key, int count){
            this.key=key;
            this.count=count;
        }
    }
}