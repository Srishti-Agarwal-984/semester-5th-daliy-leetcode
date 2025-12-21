// Last updated: 12/21/2025, 9:18:43 PM
1/*
2// Definition for a QuadTree node.
3class Node {
4    public boolean val;
5    public boolean isLeaf;
6    public Node topLeft;
7    public Node topRight;
8    public Node bottomLeft;
9    public Node bottomRight;
10
11    
12    public Node() {
13        this.val = false;
14        this.isLeaf = false;
15        this.topLeft = null;
16        this.topRight = null;
17        this.bottomLeft = null;
18        this.bottomRight = null;
19    }
20    
21    public Node(boolean val, boolean isLeaf) {
22        this.val = val;
23        this.isLeaf = isLeaf;
24        this.topLeft = null;
25        this.topRight = null;
26        this.bottomLeft = null;
27        this.bottomRight = null;
28    }
29    
30    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
31        this.val = val;
32        this.isLeaf = isLeaf;
33        this.topLeft = topLeft;
34        this.topRight = topRight;
35        this.bottomLeft = bottomLeft;
36        this.bottomRight = bottomRight;
37    }
38}
39*/
40
41class Solution {
42    public Node construct(int[][] grid) {
43        return helper(grid, 0, grid.length, 0, grid[0].length);
44    }
45    public Node helper(int[][] grid, int sr, int er, int sc, int ec){
46        if(er-sr==1 && ec-sc==1){
47            return new Node(grid[sr][sc]==1, true);
48        }
49        Node r = new Node();
50        Node tl = helper(grid, sr, (er+sr)/2, sc, (ec+sc)/2);
51        Node tr = helper(grid, sr, (er+sr)/2, (ec+sc)/2, ec);
52        Node bl = helper(grid, (er+sr)/2, er, sc, (ec+sc)/2);
53        Node br = helper(grid, (er+sr)/2, er,(ec+sc)/2, ec);
54        if(tl.isLeaf && bl.isLeaf && br.isLeaf && tr.isLeaf && tl.val==tr.val && tl.val==br.val && tl.val==bl.val){
55            r.val = tl.val;
56            r.isLeaf = true;
57            return r;
58        }
59        r.val = true;
60        r.isLeaf = false;
61        r.topLeft =tl;
62        r.topRight =tr;
63        r.bottomLeft = bl;
64        r.bottomRight = br;
65        return r;
66
67
68
69
70    }
71}