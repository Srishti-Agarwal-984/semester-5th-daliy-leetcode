// Last updated: 12/26/2025, 8:48:17 AM
1class Solution {
2    public int bestClosingTime(String customers) {
3        int[] p = new int[customers.length()+1];
4        int[] s = new int[customers.length()+1];
5
6        p[customers.length()-1]=customers.charAt(customers.length()-1)=='Y'?1:0;
7        int c=0;
8        for(int i=customers.length()-2; i>=0; i--){
9            p[i]=p[i+1]+(customers.charAt(i)=='Y'?1:0);
10        }
11        s[0]=0;
12        c=0;
13        for(int i=1; i<customers.length(); i++){
14            if(customers.charAt(i-1)=='N'){
15                s[i]=1;
16            }
17            s[i]+=s[i-1];
18        }
19        s[s.length-1]=s[s.length-2];
20       // int c=0;
21        int ans = Integer.MAX_VALUE;
22        int min=Integer.MAX_VALUE;
23        for(int i=0; i<s.length; i++){
24            // if(customers.charAt(i)=='Y'){
25            //     c++;
26            // }
27            int l = s[i]+p[i];
28            //System.out.println(l);
29            if(l<ans){
30                min=i;
31                ans = l;
32            }
33        }
34        // if(min==0){
35        //     return 0;
36        // }
37        return min;
38    }
39}