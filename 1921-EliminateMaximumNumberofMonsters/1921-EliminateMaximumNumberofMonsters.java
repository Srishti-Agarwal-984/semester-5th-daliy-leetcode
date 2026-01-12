// Last updated: 1/12/2026, 10:38:34 AM
1class Solution {
2    public int eliminateMaximum(int[] dist, int[] speed) {
3        int[] u = new int[dist.length];
4        for(int i=0; i<speed.length; i++){
5            int r = dist[i]/speed[i];
6            if(dist[i]%speed[i]!=0){
7                r++;
8            }
9            u[i]=r;
10        }
11        Arrays.sort(u);
12        int ans=1;
13
14        for(int i=1; i<u.length; i++){
15            u[i]-=ans;
16            if(u[i]==0){
17                break;
18            }
19            ans++;
20        }
21        return ans;
22        
23    }
24}