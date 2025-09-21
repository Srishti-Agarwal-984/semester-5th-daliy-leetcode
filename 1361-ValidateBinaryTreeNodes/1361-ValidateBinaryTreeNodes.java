// Last updated: 9/21/2025, 7:13:40 PM
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];

        // Step 1: Calculate indegree
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                indegree[leftChild[i]]++;
                if (indegree[leftChild[i]] > 1) return false; // multiple parents
            }
            if (rightChild[i] != -1) {
                indegree[rightChild[i]]++;
                if (indegree[rightChild[i]] > 1) return false; // multiple parents
            }
        }

        // Step 2: Find root (node with indegree 0)
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                if (root != -1) return false; // more than one root
                root = i;
            }
        }
        if (root == -1) return false; // no root found

        // Step 3: BFS/DFS to check connectivity
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        visited[root] = true;
        int visitedCount = 1;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (leftChild[node] != -1) {
                if (visited[leftChild[node]]) return false; // cycle detected
                visited[leftChild[node]] = true;
                visitedCount++;
                q.add(leftChild[node]);
            }
            if (rightChild[node] != -1) {
                if (visited[rightChild[node]]) return false; // cycle detected
                visited[rightChild[node]] = true;
                visitedCount++;
                q.add(rightChild[node]);
            }
        }

        // Step 4: Ensure all nodes are visited
        return visitedCount == n;
    }
}
