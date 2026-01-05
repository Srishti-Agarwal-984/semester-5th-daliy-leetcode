// Last updated: 1/5/2026, 2:44:23 PM
1class Solution {
2    public boolean sumOfNumberAndReverse(int num) {
3        
4        for(int i=0; i<=num; i++){
5            int r = num-i;
6            int c=0;
7            int q = i;
8            while(q!=0){
9                c=c*10+q%10;
10                q=q/10;
11            }
12            //System.out.println(i+" "+r);
13            if(c==r){
14                return true;
15            }
16            
17        }
18        return false;
19    }
20}