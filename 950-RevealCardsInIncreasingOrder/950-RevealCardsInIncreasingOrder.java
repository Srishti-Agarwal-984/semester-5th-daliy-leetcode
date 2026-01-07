// Last updated: 1/7/2026, 7:10:29 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        Queue<Integer> q = new LinkedList<>();
5        for(int i=0; i<deck.length; i++){
6            q.add(i);
7        }
8        int[] ans = new int[deck.length];
9        for(int i: deck){
10            ans[q.poll()] = i;
11            if(!q.isEmpty()){
12                q.add(q.poll());
13            }
14        }
15        return ans;
16        
17    }
18}