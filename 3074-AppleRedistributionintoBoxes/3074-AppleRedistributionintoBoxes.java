// Last updated: 12/24/2025, 11:00:46 AM
1class Solution {
2    public int minimumBoxes(int[] apple, int[] capacity) {
3        Arrays.sort(capacity);
4        int sum = 0;
5        for(int i=0; i<apple.length; i++){
6            sum=sum+ apple[i];
7        }
8        int g=0, k=0;
9        for(int i=capacity.length-1; i>=0; i--){
10            k=k+capacity[i];
11            g=g+1;
12            if(k>=sum){
13                break;
14            }
15
16        }
17        return g;
18        
19    }
20}