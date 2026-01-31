// Last updated: 1/31/2026, 8:32:06 AM
1class Solution {
2    public boolean canTransform(String start, String result) {
3        if(start.length()==1){
4            return start.charAt(0)==result.charAt(0);
5        }
6        int i=0, j=0;
7        while(i<start.length() && j<start.length() ){
8            char s= start.charAt(i);
9            char r = result.charAt(j);
10            if(s=='X'){
11                i++;
12                continue;
13            }
14            if(r=='X'){
15                j++;
16                continue;
17            }
18            else if(s=='L' && r=='L'){
19                if(i>=j){
20                    i++;
21                    j++;
22                }
23                else{
24                    return false;
25                }
26            }else if(s=='R' && r=='R'){
27                if(j>=i){
28                    i++;
29                    j++;
30                }
31                else{
32                    return false;
33                }
34            }
35            else{
36                return false;
37            } 
38        }
39        while(i<start.length()){
40            if(start.charAt(i)!='X'){
41                return false;
42            }
43            i++;
44        }
45        while(j<start.length()){
46            if(result.charAt(j)!='X'){
47                return false;
48            }
49            j++;
50        }
51        return true;
52    }
53}