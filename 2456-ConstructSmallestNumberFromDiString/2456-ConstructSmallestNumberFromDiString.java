// Last updated: 7/31/2025, 5:28:50 PM
import java.util.*;
class Solution {
    public String smallestNumber(String pattern) {
        int[] ar1  = new int[pattern.length()+1];
        Stack<Integer> arr = new Stack<>();
        int p=1;
        for(int i=0; i<pattern.length(); i++){
            arr.push(i);
            while(!arr.isEmpty() && pattern.charAt(i)=='I'){
                ar1[arr.pop()]=p;
                p++;
            }
        }
        arr.push(pattern.length());
        String kl ="";

        while(!arr.isEmpty()){
            ar1[arr.pop()]=p;
            p++;
        }
        for(int i=0; i<pattern.length()+1; i++){
            kl+=String.valueOf(ar1[i]);
        }
        return kl;
        
        
    }
}