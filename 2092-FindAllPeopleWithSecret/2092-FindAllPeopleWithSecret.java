// Last updated: 12/19/2025, 8:45:28 AM
1class Solution {
2    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
3        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);
4        
5        boolean[] knowsSecret = new boolean[n];
6        knowsSecret[0] = true;
7        knowsSecret[firstPerson] = true;
8        
9        int i = 0;
10        int m = meetings.length;
11        while (i < m) {
12            int currentTime = meetings[i][2];
13            Map<Integer, List<Integer>> adjL = new HashMap<>();
14            Set<Integer> people = new HashSet<>();
15            
16            while(i < m && meetings[i][2] == currentTime) {
17                int x = meetings[i][0];
18                int y = meetings[i][1];
19                adjL.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
20                adjL.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
21                people.add(x);
22                people.add(y);
23                i++;
24            }
25            Queue<Integer> queue = new LinkedList<>();
26            for (int p : people) {
27                if (knowsSecret[p]) {
28                    queue.offer(p);
29                }
30            }
31            while (!queue.isEmpty()) {
32                int curr = queue.poll();
33                for (int neighbor : adjL.getOrDefault(curr, new ArrayList<>())) {
34                    if (!knowsSecret[neighbor]) {
35                        knowsSecret[neighbor] = true;
36                        queue.offer(neighbor);
37                    }
38                }
39            }
40        }
41        List<Integer> result = new ArrayList<>();
42        for (int j = 0; j < n; j++) {
43            if (knowsSecret[j]) result.add(j);
44        }
45        return result;
46    }
47}