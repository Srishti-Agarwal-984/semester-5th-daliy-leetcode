// Last updated: 7/31/2025, 5:37:51 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li = new ArrayList<>();
        int c=0;
        for(int i=0; i<intervals.length; i++){
            if(c!=1 && intervals[i][1]>=newInterval[0] && intervals[i][0]<=newInterval[0]){
                int[] a = new int[2];
                a[0]=Math.min(newInterval[0],intervals[i][0]);
                a[1]=Math.max(newInterval[1],intervals[i][1]);
                li.add(a);
                c=1;
            }
            else if(c!=1 && intervals[i][1]>=newInterval[1] && intervals[i][0]<=newInterval[1]){
                int[] a = new int[2];
                a[0]=Math.min(newInterval[0],intervals[i][0]);
                a[1]=Math.max(newInterval[1],intervals[i][1]);
                li.add(a);
                c=1;

            }
            else if(c!=1 && intervals[i][0]<=newInterval[1] && intervals[i][0]>=newInterval[0]){
                int[] a = new int[2];
                a[0]=Math.min(newInterval[0],intervals[i][0]);
                a[1]=Math.max(newInterval[1],intervals[i][1]);
                li.add(a);
                c=1;
            }
            else if(intervals[i][0]>newInterval[1] && c!=1){
                li.add(newInterval);
                li.add(intervals[i]);
                c=1;
            }
            else if (c==1 && intervals[i][0]<=li.get(li.size()-1)[1]){
                int[] a = new int[2];
                a[0]=Math.min(li.get(li.size()-1)[0],intervals[i][0]);
                a[1]=Math.max(li.get(li.size()-1)[1],intervals[i][1]);
                li.remove(li.size()-1);
                li.add(a); 
            }
            else{
                li.add(intervals[i]);
            }
        }
        if(c==0){
            li.add(newInterval);
        }
        int[][] ans = new int[li.size()][2];
        int i=0;
        for(int[] item : li){
            ans[i]=item;
            i++;
        }
        return ans;
        
    }
}