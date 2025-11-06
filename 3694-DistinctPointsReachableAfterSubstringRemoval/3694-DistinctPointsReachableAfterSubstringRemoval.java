// Last updated: 11/6/2025, 6:47:04 AM
class Solution {
    public int distinctPoints(String s, int k) {
        int[] x=new int[s.length()];
        int[] y=new int[s.length()];
        if(s.charAt(0)=='U'){
            y[0]=1;
        }
        else if(s.charAt(0)=='D'){
            y[0]=-1;
        }
        else if(s.charAt(0)=='R'){
            x[0]=1;
        }else{
            x[0]=-1;
        }
        for(int i=1; i<s.length(); i++){
            x[i]=x[i-1];
            y[i]=y[i-1];
            if(s.charAt(i)=='U'){
                y[i]+=1;
            }
            else if(s.charAt(i)=='D'){
                y[i]+=-1;
            }
            else if(s.charAt(i)=='R'){
                x[i]+=1;
            }else{
                x[i]+=-1;
            }
            //System.out.println(x[i]+" "+y[i]);
        }
        HashSet<String> st = new HashSet<>();
        st.add((x[x.length-1]-x[k-1])+"."+(y[y.length-1]-y[k-1]));
        for(int i=k; i<x.length; i++){
            int a=x[x.length-1]-x[i]+x[i-k];
            int b = y[y.length-1]-y[i]+y[i-k];
            
            st.add(a+"."+b);
        }
        return st.size();

        
    }
}