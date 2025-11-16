// Last updated: 11/16/2025, 6:59:19 PM
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Pair p1, Pair p2){
                if(p1.c==p2.c){
                    return p1.s.compareTo(p2.s);
                }
                return p2.c-p1.c;
            }
        });
        List<String> li = new ArrayList<>();
        for(String k1: map.keySet()){
            pq.add(new Pair(k1, map.get(k1)));
        }
        while(k>0){
            li.add(pq.poll().s);
            k--;
        }
        return li;
        
    }
    class Pair{
        String s;
        int c;
        public Pair(String s, int c){
            this.s=s;
            this.c=c;
        }
    }
}