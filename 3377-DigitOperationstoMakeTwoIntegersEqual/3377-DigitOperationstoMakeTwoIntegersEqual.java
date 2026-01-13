// Last updated: 1/13/2026, 4:31:55 PM
1class Solution {
2    public int minOperations(int n, int m) {
3        if(Prime(n) || Prime(m)){
4            return -1;
5        }
6
7        String start = String.valueOf(n);
8        String target = String.valueOf(m);
9
10        if (start.length() != target.length()) return -1;
11
12        PriorityQueue<Pair> pq =
13            new PriorityQueue<>((a, b) -> a.val - b.val);
14
15        pq.add(new Pair(start, n));
16        HashMap<String, Integer> vi = new HashMap<>();
17
18        while (!pq.isEmpty()) {
19            Pair p = pq.poll();
20
21            if (p.s.equals(target)) return p.val;
22
23            if (vi.containsKey(p.s) ) continue;
24            vi.put(p.s, p.val);
25
26            for (int i = 0; i < p.s.length(); i++) {
27                char[] arr = p.s.toCharArray();
28
29                // increment
30                if (arr[i] < '9') {
31                    arr[i]++;
32                    String ns = new String(arr);
33                    if (ns.charAt(0) != '0' && !Prime(Integer.parseInt(ns))) {
34                        pq.add(new Pair(ns, p.val + Integer.parseInt(ns)));
35                    }
36                }
37
38                arr = p.s.toCharArray();
39                // decrement
40                if (arr[i] > '0') {
41                    arr[i]--;
42                    String ns = new String(arr);
43                    if (ns.charAt(0) != '0' && !Prime(Integer.parseInt(ns))) {
44                        pq.add(new Pair(ns, p.val +Integer.parseInt(ns) ));
45                    }
46                }
47            }
48        }
49        return -1;
50    }
51
52    public boolean Prime(int p) {
53        if (p <= 1) return false;
54        for (int i = 2; i * i <= p; i++) {
55            if (p % i == 0) return false;
56        }
57        return true;
58    }
59
60    class Pair {
61        String s;
62        int val;
63        Pair(String s, int val) {
64            this.s = s;
65            this.val = val;
66        }
67    }
68}