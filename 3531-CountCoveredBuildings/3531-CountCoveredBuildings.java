// Last updated: 12/11/2025, 12:38:39 PM
1class Solution {
2    public int countCoveredBuildings(int n, int[][] buildings) {
3        HashMap<Integer, List<Integer> > x = new HashMap<>();
4        HashMap<Integer, List<Integer> > y = new HashMap<>();
5        for(int i=1; i<=n; i++){
6            x.put(i, new ArrayList<>());
7            y.put(i, new ArrayList<>());
8        }
9        for(int[] a: buildings){
10            x.get(a[0]).add(a[1]);
11            y.get(a[1]).add(a[0]);
12        }
13        for(int i=1; i<=n; i++){
14           Collections.sort(x.get(i));
15           Collections.sort(y.get(i));
16        }
17        int ans=0;
18        for(int[] a: buildings){
19            int x1 = a[0];
20            int y1  =a[1];
21            if(x.get(x1).size()>=3 && y.get(y1).size()>=3){
22                if(y1!=x.get(x1).get(0) && y1!=x.get(x1).get(x.get(x1).size()-1) && x1!=y.get(y1).get(0) &&  x1!=y.get(y1).get(y.get(y1).size()-1)){
23                    ans++;
24                }
25            }
26        }
27
28        return ans;
29
30
31        
32    }
33}