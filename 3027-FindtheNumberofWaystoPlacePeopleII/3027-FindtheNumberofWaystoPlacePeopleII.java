// Last updated: 9/4/2025, 5:17:22 AM
class Solution {
    public int numberOfPairs(int[][] points) {
        Pair[] arr = new Pair[points.length];
        for(int i=0; i<points.length; i++){
            arr[i]=new Pair(points[i][0], points[i][1]);
        }
        Arrays.sort(arr, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2){
                if(o1.a!=o2.a){
                    return o1.a-o2.a;
                }
                return o2.b-o1.b;
            }
        });
        int ans=0;
        for(int i=0; i<arr.length; i++){
            int x1 = arr[i].a;
            int y1 = arr[i].b;
            int max = Integer.MIN_VALUE;
            for(int j = i+1; j<arr.length; j++){
                int x2 = arr[j].a;
                int y2 = arr[j].b;
                if(y2 > y1){
                    continue;
                }
                if(y2 > max){
                    ans++;
                    max = y2;
                }
            }
        }
        return ans;
        
    }
    public class Pair{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b=b;
        }
    }
}