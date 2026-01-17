// Last updated: 1/17/2026, 7:59:51 AM
1class Solution {
2    public String largestMerge(String word1, String word2) {
3        int n1 = word1.length();
4        int n2 = word2.length();
5        StringBuilder sb = new StringBuilder();
6        int i = 0;
7        int j = 0;
8        // "cbcabaaa a"
9        // "abdcababcabca"
10        while(i < n1 && j < n2){
11            char ch1 = word1.charAt(i);
12            char ch2 = word2.charAt(j);
13            if(ch1 > ch2){
14                sb.append(ch1);
15                i++;
16            }
17            else if(ch2 > ch1){
18                sb.append(ch2);
19                j++;
20            }
21            else{
22                if(word1.substring(i).compareTo(word2.substring(j)) < 0){
23                    sb.append(word2.charAt(j++));
24                }
25                else{
26                    sb.append(word1.charAt(i++));
27                }
28            }
29        }
30        sb.append(word2.substring(j));
31        sb.append(word1.substring(i));
32        return sb.toString();
33    }
34}