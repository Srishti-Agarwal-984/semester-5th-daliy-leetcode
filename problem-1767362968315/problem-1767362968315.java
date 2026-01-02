// Last updated: 1/2/2026, 7:39:28 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    HashMap<Node, Node> map = new HashMap<>();
18
19    public Node copyRandomList(Node head) {
20        if (head == null) return null;
21
22        // if already cloned, return it
23        if (map.containsKey(head)) {
24            return map.get(head);
25        }
26
27        // create new node
28        Node copy = new Node(head.val);
29        map.put(head, copy);
30
31        // clone next and random
32        copy.next = copyRandomList(head.next);
33        copy.random = copyRandomList(head.random);
34
35        return copy;
36    }
37}
38