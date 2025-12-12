// Last updated: 12/12/2025, 7:44:06 PM
1class Solution {
2    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
3        HashMap<Integer, Integer> map  = new HashMap<>();
4        int[] ans = new int[numberOfUsers];
5        Collections.sort(events, (a, b)->(Integer.parseInt(a.get(1))==Integer.parseInt(b.get(1))? b.get(0).charAt(0)-a.get(0).charAt(0):Integer.parseInt(a.get(1))-Integer.parseInt(b.get(1))));
6        for(List<String> li: events){
7            if(li.get(0).charAt(0)=='O'){
8                map.put(Integer.parseInt(li.get(2)), Integer.parseInt(li.get(1)));
9            }
10            else{
11                if(li.get(2).charAt(0)=='A'){
12                    for(int i=0; i<ans.length; i++){
13                        ans[i]++;
14                    }
15                }
16                else if(li.get(2).charAt(0)=='H'){
17                    for(int i=0; i<ans.length; i++){
18                        if(map.containsKey(i)){
19                            if(map.get(i)+60<=Integer.parseInt(li.get(1))){
20                                ans[i]++;
21                                map.remove(i);
22                            }
23                        }
24                        else{
25                            ans[i]++;
26
27                        } 
28                    }
29                }
30                else{
31                    String[] a = li.get(2).split(" ");
32                    for(String s: a){
33                        int r = Integer.parseInt(s.substring(2));
34                        ans[r]++;
35                    }
36                }
37            }
38        }
39        return ans;
40
41        
42    }
43}