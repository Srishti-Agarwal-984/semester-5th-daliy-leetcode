// Last updated: 12/24/2025, 8:32:28 PM
1class Solution {
2    public String smallestString(String s) {
3        int g=0;
4        StringBuilder sb = new StringBuilder();
5        for(int i=0; i<s.length(); i++){
6            if(s.charAt(i)!='a'){
7                sb.append(""+(char)(s.charAt(i)-1));
8                g++;
9            }
10            else{
11                if(g>0){
12                    sb.append(s.substring(i));
13                    break;
14                }
15                sb.append(s.charAt(i));
16            }
17        }
18        if(g==0){
19            return sb.toString().substring(0, s.length()-1)+"z";
20        }
21        return sb.toString();
22        
23    }
24}