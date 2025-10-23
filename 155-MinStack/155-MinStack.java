// Last updated: 10/23/2025, 6:16:04 PM
class MinStack {
    public List<Integer> li= new ArrayList<>();
    public int min=Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        min=Math.min(val,min);
        li.add(val);
    }
    
    public void pop() {
        int a=li.get(li.size()-1);
        li.remove(li.size()-1);
        
    }
    
    public int top() {
        int a=li.get(li.size()-1);
        return a;
    }
    
    public int getMin() {
        int r = Integer.MAX_VALUE;
        for(int el: li){
            r = Math.min(r, el);
        }
        return r;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */