// Last updated: 8/20/2025, 11:01:00 PM
import java.util.*;
class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum=0.0;
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]*1.0);
            sum+=nums[i];
        }
        int c=0;
        double half = sum/2.0;
        while(sum>half){
            double p= pq.poll();
            sum=sum-p;
            sum=sum+p/2.0;
            pq.add(p/2.0);
            c++;
        }
        return c;

    }
}