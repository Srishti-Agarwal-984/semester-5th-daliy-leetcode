// Last updated: 11/6/2025, 5:49:35 AM
class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int[] ans = new int[aliceValues.length];
        PriorityQueue<Pair> pq =new PriorityQueue<>( new Comparator<Pair>(){
             @Override
            public int compare(Pair p1, Pair p2){
                return p2.sum-p1.sum;

            }

        }
           
        );
        for(int i=0; i<aliceValues.length; i++){
            pq.add(new Pair(i, aliceValues[i]+bobValues[i]));
        }
        int bob=0, alice=0;
        int c=0;
        while(!pq.isEmpty()){
            Pair r = pq.poll();
            if(c%2==0){
                
                alice=alice+r.sum-bobValues[r.i];
            }
            else{
                bob+=r.sum-aliceValues[r.i];
            }
            c++;

        }
        if(bob==alice){
            return 0;
        }
        return bob>alice?-1:1;


        
    }
    class Pair{
        int i;
        int sum;
        public Pair(int i, int sum){
            this.i=i;
            this.sum=sum;
        }
    }
}