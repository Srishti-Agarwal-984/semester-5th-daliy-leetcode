// Last updated: 7/31/2025, 5:33:14 PM
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> as = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!as.isEmpty() && temperatures[as.peek()]<temperatures[i]){
                ans[as.peek()]=i-as.pop();
            }
            as.push(i);
        }
        while(!as.isEmpty()){
            ans[as.pop()]=0;
        }
        return ans;
        
    }
}