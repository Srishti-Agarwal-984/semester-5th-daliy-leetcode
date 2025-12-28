// Last updated: 12/28/2025, 8:53:05 AM
1class Solution {
2    public int minAllOneMultiple(int k) {
3        if(k%2==0){
4            return -1;
5        }
6        if(k%5==0){
7            return -1;
8        }
9        int i=1;
10        int c=1;
11        while(i%k!=0){
12            i = (i%k)*10+1;
13            //System.out.println(i);
14            c++;
15        }
16        return c;
17        
18        
19    }
20}