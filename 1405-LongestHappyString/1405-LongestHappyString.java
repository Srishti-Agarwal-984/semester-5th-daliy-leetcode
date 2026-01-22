// Last updated: 1/23/2026, 3:49:40 AM
1class Solution {
2    public String longestDiverseString(int a, int b, int c) {
3        StringBuilder sb = new StringBuilder();
4        while(a>0 || b>0 || c>0){
5            if(a>=b && a>=c && a>0){
6                if(sb.length()<2 || (sb.charAt(sb.length()-1)!='a' || sb.charAt(sb.length()-2)!='a')){
7                    sb.append("a");
8                    a--;
9                }
10                else{
11                    if(b>=c && b>0){
12                        sb.append("b");
13                        b--;
14                    }
15                    else if(c>0){
16                        sb.append("c");
17                        c--;
18                    }
19                    else{
20                        break;
21                    }
22                }
23            }
24            else if(b>=c&& b>=a && b>0){
25                if(sb.length()<2 || (sb.charAt(sb.length()-1)!='b' || sb.charAt(sb.length()-2)!='b')){
26                    sb.append("b");
27                    b--;
28                }
29                else{
30                    if(a>=c && a>0){
31                        sb.append("a");
32                        a--;
33                    }
34                    else if(c>0){
35                        sb.append("c");
36                        c--;
37                    }
38                    else{
39                        break;
40                    }
41                }
42            }
43            else if(c>=b&& c>=a && c>0){
44                if(sb.length()<2 || (sb.charAt(sb.length()-1)!='c' || sb.charAt(sb.length()-2)!='c')){
45                    sb.append("c");
46                    c--;
47                }
48                else{
49                    if(a>=b && a>0){
50                        sb.append("a");
51                        a--;
52                    }
53                    else if(b>0){
54                        sb.append("b");
55                        b--;
56                    }
57                    else{
58                        break;
59                    }
60                }
61            }
62        }
63        return sb.toString();
64        
65    }
66}