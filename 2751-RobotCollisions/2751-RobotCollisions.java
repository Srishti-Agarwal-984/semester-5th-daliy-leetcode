// Last updated: 1/20/2026, 9:58:44 AM
1class Solution {
2    public List<Integer> survivedRobotsHealths(int[] p, int[] h, String d) {
3        Pair[] arr = new Pair[d.length()];
4        for(int i=0; i<arr.length; i++){
5            arr[i]=new Pair(p[i], h[i], d.charAt(i), i);
6        }
7        Arrays.sort(arr, (a, b)->a.pos-b.pos);
8        int i=0;
9        Stack<Integer> st = new Stack<>();
10        while(i<d.length()){
11            if(arr[i].dir=='L'){
12                while(!st.isEmpty()){
13                    if(arr[st.peek()].health<arr[i].health){
14                        arr[st.peek()].health=0;
15                        arr[i].health--;
16                        h[arr[st.peek()].id]=0;
17                        h[arr[i].id]--;
18                        st.pop();
19                    }
20                    else if(arr[st.peek()].health>arr[i].health){
21                        arr[st.peek()].health--;
22                        arr[i].health=0;
23                        h[arr[i].id]=0;
24                        h[arr[st.peek()].id]--;
25                        break;
26                    }
27                    else{
28                        arr[st.peek()].health=0;
29                        arr[i].health=0;
30                        h[arr[i].id]=0;
31                        h[arr[st.peek()].id]=0;
32                        st.pop();
33                        break;
34                    }  
35                }
36            }
37            else{
38                st.add(i);
39            }
40            i++;
41        }
42        List<Integer> ans = new ArrayList<>();
43        for(int i1 : h){
44            if(i1>0){
45                ans.add(i1);
46            }
47        }
48        return ans;
49
50
51    }
52    class Pair{
53        int pos;
54        int health;
55        char dir;
56        int id;
57        public Pair(int pos, int health, char dir, int id){
58            this.pos=pos;
59            this.health=health;
60            this.dir = dir;
61            this.id= id;
62        }
63    }
64}