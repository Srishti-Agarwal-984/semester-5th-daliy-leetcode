// Last updated: 8/18/2025, 6:12:59 PM
class Solution {
    public boolean parseBoolExpr(String s) {
        int n = s.length();
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i<n){
            if(s.charAt(i)==','){
                i++;
                continue;
            }
            else if (s.charAt(i)==')'){
                List<Boolean> s1 = new ArrayList<>();
                //st.pop();
                while(st.peek()!='('){
                    s1.add(st.pop()=='t'? true : false);
                }
                st.pop();
                char b = st.pop();
                boolean q = helper(s1, b);
                st.add(q==true? 't': 'f');
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        return st.pop()=='t'? true: false;
    }
    public boolean helper(List<Boolean> s1, char ch){
        if(ch=='!'){
            return !s1.get(0);
        }
        if(ch=='|'){
            for(int k=0; k<s1.size(); k++){
                if(s1.get(k)){
                    return true;
                }
            }
            return false;
        }

        for(int k=0; k<s1.size(); k++){
            if(!s1.get(k)){
                return false;
            }
        }
        return true;

    }
}