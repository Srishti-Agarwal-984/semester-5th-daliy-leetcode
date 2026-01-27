// Last updated: 1/27/2026, 4:24:40 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue<Integer> q = new LinkedList<>();
4        for(int i=0; i<tickets.length; i++){
5            q.add(i);
6        }
7        int time=0;
8        while(!q.isEmpty()){
9            time++;
10            int a = q.poll();
11            tickets[a]--;
12            if(tickets[a]!=0){
13                q.add(a);
14
15            }
16            else{
17                if(a==k){
18                    return time;
19                }
20            }
21
22        }
23        return time;
24        
25    }
26}