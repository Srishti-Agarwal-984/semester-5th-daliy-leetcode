// Last updated: 11/15/2025, 5:45:47 PM
class Solution {
    public int maxHeight(int[][] cuboids) {
        for(int[] a:cuboids ){
            Arrays.sort(a);
        }
        Arrays.sort(cuboids, new Comparator<>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0]==b[0]){
                    if(a[1]==b[1]){
                        return a[2]-b[2];
                    }
                    return a[1]-b[1];
                }
                return a[0]-b[0];
            }
        });
        Map<String, Integer> map = new HashMap<>();
        return helper(cuboids, 0, 0, 0,0, map);
        
    }
    public int helper(int[][] cuboids, int i, int w, int l, int h, Map<String, Integer> map){
        if(i>=cuboids.length){
            return 0;
        }
        if(map.containsKey(i+"*"+w+"*"+l+"*"+h)){
            return map.get(i+"*"+w+"*"+l+"*"+h);
        }
        int inc=0, exc=0;
        if(h<=cuboids[i][2] && l<=cuboids[i][1]){
            inc+=cuboids[i][2]+helper(cuboids, i+1,cuboids[i][0],cuboids[i][1],cuboids[i][2] , map);
        }
        exc=helper(cuboids, i+1,w,l,h , map);
        map.put(i+"*"+w+"*"+l+"*"+h, Math.max(inc, exc));
        return Math.max(inc, exc);
    }
}