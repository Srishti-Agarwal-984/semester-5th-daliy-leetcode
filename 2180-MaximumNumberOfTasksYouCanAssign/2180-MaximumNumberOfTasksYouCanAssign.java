// Last updated: 7/31/2025, 5:29:37 PM
class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int low=0, high = Math.min(tasks.length, workers.length);
        while(low<high){
            int mid  = (high+low+1)/2;
            if(isp(mid, tasks, workers, pills, strength)){
                low = mid;
            }
            else{
                high=mid-1;
            }
        }
        return low;

        
        //boolean[] w = new boolean[]

        
    }
    public static boolean isp(int mid,int[] tasks, int[] workers, int pills, int strength){
        int freepills = pills;
        Deque<Integer> b = new ArrayDeque<>();
        int cn=0;
        int w = workers.length-1;
        for(int l=mid-1; l>=0; l--){
            int task = tasks[l];

            if(!b.isEmpty() && b.peekFirst()>=task){
                b.pollFirst();
            }
            else if(w>=0 && workers[w]>=task){
                w--;
            }
            else{
                while(w>=0 && workers[w]+strength>=task){
                   b.addLast(workers[w--]);
                }
                if(b.isEmpty() || freepills==0){
                    return false;
                }
                b.pollLast();
                freepills--;
            }
            

        }
        return true;
    }
}