// Last updated: 12/8/2025, 6:45:26 AM
1class Solution {
2    public int scheduleCourse(int[][] courses) {
3        Arrays.sort(courses, (c1, c2) -> Integer.compare(c1[1], c2[1]));
4        // max heap to track the max duration courses
5        PriorityQueue<Integer> heap = new PriorityQueue<>((d1, d2) -> Integer.compare(d2, d1));
6        
7        int time = 0;
8        for(int[] course: courses) {
9            int duration = course[0], lastDay = course[1];
10            time += duration;
11            heap.add(duration);
12            // if pass the last day, remove courses these take longest time.
13            if(time > lastDay) {
14                time -= heap.poll();
15            }
16        }
17        return heap.size();
18	}
19}