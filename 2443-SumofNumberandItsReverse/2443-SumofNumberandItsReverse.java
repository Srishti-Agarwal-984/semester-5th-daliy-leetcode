// Last updated: 1/5/2026, 2:43:20 PM
1class Solution {
2    public boolean sumOfNumberAndReverse(int num) {
3        if(num==0){
4            return true;
5        }
6        int en =( num+1)/2;
7        for(int i=1; i<=num; i++){
8            int r = num-i;
9            int c=0;
10            int q = i;
11            while(q!=0){
12                c=c*10+q%10;
13                q=q/10;
14            }
15            //System.out.println(i+" "+r);
16            if(c==r){
17                return true;
18            }
19            
20        }
21        return false;
22    }
23}