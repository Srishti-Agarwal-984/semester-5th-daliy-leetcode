// Last updated: 1/16/2026, 12:14:44 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3
4    public List<String> addOperators(String num, int target) {
5        helper(num, target, 0, "", 0, 0);
6
7        return ans;
8
9        
10    }
11    public void helper(String num, long target, int i, String t, long sum, long prev){
12        if(i>=num.length()){
13            if(sum==target){
14                ans.add(t);
15            }
16            return;
17        }
18        for(int j=i+1; j<=num.length(); j++){
19            if(num.charAt(i)=='0' && i!=j-1){
20                break;
21            }
22            long r = Long.parseLong(num.substring(i, j));
23            String s1="+", s2="-", s3= "*";
24            if(i==0){
25                helper(num, target, j, t+num.substring(i, j), sum+r, r);
26
27            }
28            else{
29                helper(num, target, j, t+s1+num.substring(i, j), sum+r, r);
30                helper(num, target, j, t+s3+num.substring(i, j), sum-prev+ prev*r, prev*r);
31                helper(num, target, j, t+s2+num.substring(i, j), sum-r, -r);
32            }
33        }
34    }
35}
36// helper(rst, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur );