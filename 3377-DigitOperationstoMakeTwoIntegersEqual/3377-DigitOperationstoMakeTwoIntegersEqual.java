// Last updated: 1/13/2026, 4:55:52 PM
class Solution {
    private static final int MAX = 10000;
    private static final boolean[] isPrime = new boolean[MAX + 1];
    private void init() {
        if(isPrime[2]) return;
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        int limit = (int)Math.sqrt(MAX);
        for(int i = 2; i <= limit; i++) {
            if(isPrime[i]) for(int j = i * i; j <= MAX; j += i) isPrime[j] = false;
        }
    }
    public int minOperations(int n, int m) {
        init();
        if(isPrime[n] || isPrime[m]) return -1;
        int max = 1;
        while(max <= n) max *= 10;
        int[] dist = new int[max];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = n;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
        pq.offer(n);
        while(!pq.isEmpty()) {
            int current = pq.poll();
            if(current == m) return dist[current];
            for(int i = 1; i < max; i *= 10) {
                int digit = current / i % 10;
                if(digit > 0) {
                    int next = current - i;
                    if(next >= i && !isPrime[next] && dist[next] > dist[current] + next) {
                        dist[next] = dist[current] + next;
                        pq.offer(next);
                    }
                }
                if(digit < 9) {
                    int next = current + i;
                    if(!isPrime[next] && dist[next] > dist[current] + next) {
                        dist[next] = dist[current] + next;
                        pq.offer(next);
                    }
                }
            }
        }
        return -1;
    }
}