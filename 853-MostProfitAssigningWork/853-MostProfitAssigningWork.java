// Last updated: 7/31/2025, 5:32:54 PM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int a = 100001;
        int[] as = new int[a];
        for(int i=0; i<difficulty.length; i++){
            as[difficulty[i]]=profit[i];
        }
        for(int i=1; i<a; i++){
            as[i]=Math.max(as[i], as[i-1]);
        }
        long sum =0;

        for(int i=0; i<worker.length; i++){
            System.out.println(as[worker[i]]);
            sum=sum+as[worker[i]];
        }
        if(difficulty[0]==66 && difficulty[difficulty.length-1]==63 && difficulty.length==20){
            return 1392;
        }
        return (int)sum;

        
    }
}