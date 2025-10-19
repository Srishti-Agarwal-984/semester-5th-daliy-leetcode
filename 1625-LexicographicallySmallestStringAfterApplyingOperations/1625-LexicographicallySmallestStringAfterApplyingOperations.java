// Last updated: 10/20/2025, 12:09:29 AM
class Solution {
    public String add(String s,int a){
        char[] arr=s.toCharArray();
        for(int i=1;i<s.length();i=i+2){
            arr[i] = (char) (((arr[i] - '0' + a) % 10) + '0');
        }
        return String.valueOf(arr);
    }
    public String rotate(String s,int b){
        int j=s.length()-b;
        String x=s.substring(j);
        String y=s.substring(0,j);
        return x+y;
    }
    Set<String> seen=new HashSet<>();
    public String findLexSmallestString(String s, int a, int b) {
        dfs(s,a,b);
        return Collections.min(seen);
    }
    public void dfs(String s,int a,int b){
        if (seen.contains(s)){
            return;
        }
        seen.add(s);
        dfs(add(s,a),a,b);
        dfs(rotate(s,b),a,b);
        return;
    }
}