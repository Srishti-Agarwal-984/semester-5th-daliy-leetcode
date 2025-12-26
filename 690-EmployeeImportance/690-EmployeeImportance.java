// Last updated: 12/26/2025, 10:38:21 PM
1/*
2// Definition for Employee.
3class Employee {
4    public int id;
5    public int importance;
6    public List<Integer> subordinates;
7};
8*/
9
10class Solution {
11    public int getImportance(List<Employee> employees, int id) {
12        HashMap<Integer, Employee> st = new HashMap<>();
13        for(Employee e: employees){
14            st.put(e.id, e);
15        }
16        int sum=0;
17        HashSet<Integer> vi= new HashSet<>();
18        Queue<Employee> q = new LinkedList<>();
19        q.add(st.get(id));
20        while(!q.isEmpty()){
21             Employee e = q.poll();
22             if(vi.contains(e.id)){
23                continue;
24             }
25             sum+=e.importance;
26             for(int nbrs: e.subordinates){
27                if(!vi.contains(nbrs)){
28                    q.add(st.get(nbrs));
29                }
30             }
31        }
32        return sum;
33
34        
35        
36    }
37    
38}