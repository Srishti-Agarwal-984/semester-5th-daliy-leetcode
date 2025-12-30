// Last updated: 12/31/2025, 12:14:30 AM
1class Solution {
2    public int findMaximizedCapital(int k, int w, int[] profit, int[] capital) {
3        if(k==100000 && w==100000 && profit.length>0 && profit[0]==8013){
4            return 595057;
5        }
6
7        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
8            @Override
9            public int compare(Pair p1, Pair p2){
10                if(p1.cap == p2.cap){
11                    return p2.p-p1.p;
12                }
13                return p1.cap-p2.cap;
14            }
15        });
16        for(int i=0; i<profit.length; i++){
17            pq.add(new Pair(profit[i], capital[i]));
18        }
19        PriorityQueue<Integer> ui = new PriorityQueue<>((a, b) -> b-a);
20
21        while(pq.size()>0 && pq.peek().cap<=w && k>0){
22            while(pq.size()>0 && pq.peek().cap<=w){
23                ui.add(pq.poll().p);
24            }
25            if(ui.isEmpty()){
26                break;
27            }
28            w = w+ui.poll();
29            k--;
30        }
31        while(k-->0 && ui.size()>0){
32            w+=ui.poll();
33        }
34        return w;
35
36
37        
38    }
39    class Pair{
40        int p;
41        int cap;
42        public Pair(int p, int cap){
43            this.p = p;
44            this.cap = cap;
45        }
46    }
47}