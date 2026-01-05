// Last updated: 1/5/2026, 5:19:02 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] arr = s.split(" ");
4        if(arr.length==1 && pattern.length()==1){
5            return true;
6        }
7        if(arr.length!=pattern.length()){
8            return false;
9        }
10        HashMap<String, Integer> map= new HashMap<>();
11        String[] ar = new String[26];
12        Arrays.fill(ar, "*");
13        String p = pattern;
14        for(int i=0; i<pattern.length(); i++){
15            if(ar[p.charAt(i)-'a'].charAt(0)=='*'){
16                ar[p.charAt(i)-'a']=arr[i];
17            }
18            else if(ar[p.charAt(i)-'a'].charAt(0)!='*' && ar[p.charAt(i)-'a'].compareTo(arr[i])!=0){
19                return false;
20            }
21            if(map.containsKey(arr[i]) && map.get(arr[i])!=p.charAt(i)-'a'){
22                return false;
23            }
24            map.put(arr[i], p.charAt(i)-'a');
25            
26
27        
28        }
29        return true;
30        
31    }
32}