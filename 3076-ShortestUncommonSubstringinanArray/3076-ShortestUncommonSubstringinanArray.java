// Last updated: 1/10/2026, 7:55:21 PM
1class Solution {
2    public String[] shortestSubstrings(String[] arr) {
3        int n = arr.length;
4        String results[] = new String[n];
5
6        HashMap<String,Integer> map = new HashMap<>();
7        for(int i =0;i<n;i++){
8            String str = arr[i];
9            int len = str.length();
10            HashSet<String> set = new HashSet<>();
11            for(int j =0;j<len;j++){
12                String substr = "";
13                for(int k =j;k<len;k++){
14                    substr = substr + str.charAt(k);
15                    set.add(substr);
16                }
17            }
18            for(String val : set)map.put(val, map.getOrDefault(val,0) + 1);
19        }
20
21        for(int i =0;i<n;i++){
22            String str = arr[i];
23            int len = str.length();
24
25            int size = Integer.MAX_VALUE;
26            String ans = "";
27
28            for(int j =0;j<len;j++){
29                String substr = "";
30                for(int k =j;k<len;k++){
31                    substr = substr.concat(String.valueOf(str.charAt(k)));
32                    int subLen = substr.length();
33                    if(map.get(substr) == 1){
34                        if((size > subLen) || (size == subLen && !ans.equals(substr) && (ans.compareTo(substr)) > 0) ){
35                            size = subLen;
36                            ans = substr;
37                        }
38                    }
39                }
40            }
41            results[i] = ans;
42        }
43        return results;
44    }
45}