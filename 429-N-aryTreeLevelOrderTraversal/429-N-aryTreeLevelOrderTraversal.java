// Last updated: 12/23/2025, 1:17:36 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public List<List<Integer>> levelOrder(Node root) {
22
23        List<List<Integer>> ans = new ArrayList<>();
24        if(root==null){
25            return ans;
26        }
27        Queue<Pair> q = new LinkedList<>();
28        q.add(new Pair(root, 0));
29        int c=1;
30        while(!q.isEmpty()){
31            Pair p = q.poll();
32            if(p.level==ans.size()){
33                ans.add(new ArrayList<>());
34                
35            }
36            ans.get(p.level).add(p.ro.val);
37            for(Node nbrs: p.ro.children){
38                if(nbrs==null){
39                    continue;
40                }
41                q.add(new Pair(nbrs, p.level+1));
42            }
43
44        }
45        return ans;
46        
47    }
48    class Pair{
49        Node ro;
50         int level;
51         public Pair(Node ro, int level){
52            this.ro = ro;
53            this.level = level;
54         }
55    }
56}