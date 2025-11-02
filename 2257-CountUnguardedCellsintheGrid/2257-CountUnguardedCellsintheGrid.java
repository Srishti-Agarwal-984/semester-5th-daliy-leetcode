// Last updated: 11/2/2025, 9:28:47 PM
class Solution {
    
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        HashSet<String> map = new HashSet<>();
        HashSet<String> map1 = new HashSet<>();

        for(int i=0; i<walls.length; i++){
            map1.add(walls[i][0]+"-"+walls[i][1]);
            
        }
        for(int i=0; i<guards.length; i++){
            map1.add(guards[i][0]+"-"+guards[i][1]);
            
        }
        int ans=0;
        for(int i=0; i<guards.length; i++){
            //map.add(guards[i][0]+"-"+guards[i][1]);
            int a=0, b=0, c=0,d=0;
            for(int row=guards[i][0]-1; row>=0; row--){
                if(map1.contains(row+"-"+guards[i][1])){
                    break;
                }
                map.add(row+"-"+guards[i][1]);
                a++;
            }
            for(int row=guards[i][0]+1; row<m; row++){
                if(map1.contains(row+"-"+guards[i][1])){
                    break;
                }
                map.add(row+"-"+guards[i][1]);
                b++;
            }
            for(int col=guards[i][1]-1; col>=0; col--){
                if(map1.contains(guards[i][0]+"-"+col)){
                    break;
                }
                map.add(guards[i][0]+"-"+col);
                c++;
            }
            for(int col=guards[i][1]+1; col<n; col++){
                if(map1.contains(guards[i][0]+"-"+col)){
                    break;
                }
                map.add(guards[i][0]+"-"+col);
                d++;
            }
            //System.out.println(a+" "+b+" "+c+" "+d);
        }
        return m*n-(map.size()+map1.size());
        



        
    }
}