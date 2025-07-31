// Last updated: 7/31/2025, 5:37:53 PM
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> ar = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        List<Integer> ar2 = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            ar.add(intervals[i][0]);
            ar1.add(intervals[i][0]);
            ar2.add(intervals[i][1]);
        }
        Collections.sort(ar);
        int c=0;
        List<int[]> ab = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int y=ar1.indexOf(ar.get(i));
            int j=ar.get(i);
            int d=ar2.get(y);
            ar1.remove(y);
            ar2.remove(y);
            //System.out.println(d);
            if(i!=0 && ab.size()!=0){
                int[] last = ab.get(ab.size() - 1);
                if(j <= last[1]){
                    int l = Math.max(last[1],d);
                    last[1]=l;
                    ab.remove(ab.size()-1);
                    ab.add(last);
                    //System.out.println(l);
                }
                else{
                    int[] as = {j,d};
                    ab.add(as);
                }
            }
            else{
                int[] as = {j,d};
                ab.add(as);
            }
        }
        int r = ab.size();
        
        int[][] arr = new int[r][2];
        for(int i=0; i<r; i++){
            arr[i]=ab.get(i);
        }
        return arr;
        




        
        
    }
}