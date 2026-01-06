// Last updated: 1/6/2026, 6:53:11 PM
1class Solution {
2    public int minimumJumps(int[] forbidden, int a, int b, int x) {
3        HashSet<Integer> ban = new HashSet<>();
4        int max = 0;
5        for(int i: forbidden){
6            max = Math.max(max, i);
7            ban.add(i);
8        }
9        max = Math.max(max, x)+a+b;
10        Queue<int[]> q = new LinkedList<>();
11        q.offer(new int[]{0,0,0});
12
13        boolean[][] vi = new boolean[max+1][2];
14        vi[0][0]=true;
15        while(!q.isEmpty()){
16            int[] o = q.poll();
17            if(o[0]==x){
18                return o[2];
19            }
20            if(a+o[0]<=max && !ban.contains(a+o[0]) && !vi[a+o[0]][0]){
21                vi[a+o[0]][0]=true;
22                q.offer(new int[]{a+o[0], 0, o[2]+1});
23                
24            }
25            if(o[1]==0 && o[0]-b>=0&& !ban.contains(o[0]-b) && !vi[o[0]-b][1]){
26                vi[o[0]-b][1]=true;
27                q.offer(new int[]{o[0]-b, 1, o[2]+1 });
28            }
29        }
30        return -1;
31        
32    }
33}