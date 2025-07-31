// Last updated: 7/31/2025, 5:34:42 PM
import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()){
            return "0";
        }
        Stack<Integer> ar = new Stack<>();
        ar.push(num.charAt(0)-'0');
        for(int i=1; i<num.length(); i++){
            int p= num.charAt(i)-'0';
            while(!ar.isEmpty() && p<ar.peek() && k>0){
                ar.pop();
                k--;
            }
            ar.push(p);
        }
        while(k!=0){
            ar.pop();
            k--;
        }
        String ans="";
        while(!ar.isEmpty()){
            ans=String.valueOf(ar.pop())+ans;
        }
        if(ans.length()==0){
            return "0";
        }
        while(ans.length()!=0 && ans.charAt(0)=='0'){
            ans=ans.substring(1);
        }
        if(ans.length()==0){
            return "0";
        }
        return ans;

        
        
    }
}