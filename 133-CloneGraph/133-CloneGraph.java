// Last updated: 12/8/2025, 5:50:53 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    // HashMap to bridge the Original Graph and the Cloned Graph
23    // Key: Original Node -> Value: New Cloned Node
24    private HashMap<Node, Node> map = new HashMap<>();
25
26    public Node cloneGraph(Node node) {
27        // Edge Case: Empty graph
28        if (node == null) {
29            return null;
30        }
31
32        // STEP 1: Check the Map (Cycle Handling)
33        // If we have already visited/cloned this node, return the existing clone.
34        if (map.containsKey(node)) {
35            return map.get(node);
36        }
37
38        // STEP 2: Create the Clone
39        // We create the node, but its neighbors are currently empty
40        Node cloneNode = new Node(node.val);
41
42        // STEP 3: Register in Map (Critical)
43        // We MUST put it in the map before recursing to neighbors to prevent infinite loops
44        map.put(node, cloneNode);
45
46        // STEP 4: Traverse Neighbors (DFS)
47        for (Node neighbor : node.neighbors) {
48            // Recurse: This will either create a new neighbor or return an existing one
49            // We add that result to our current clone's neighbor list
50            cloneNode.neighbors.add(cloneGraph(neighbor));
51        }
52
53        return cloneNode;
54    }
55}