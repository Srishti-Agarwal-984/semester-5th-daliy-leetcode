// Last updated: 7/31/2025, 5:29:12 PM
class Solution {
    public long smallestNumber(long num) {
        List<Long> st = new ArrayList<>();
        int sign = 1;
        if(num<0){
            num=num*-1;
            sign=-1;
        }
        long ans = 0;

        while(num!=0){
            st.add(num%10);
            num/=10;
        }
        Collections.sort(st);
        if(sign<0){
            for(int i=st.size()-1; i>=0; i--){
                ans=ans*10+st.get(i);

            }
            //System.out.println(ans);
            return -ans;
            
        }
        int i=0;
        long u=1;
        for(i=0; i<st.size(); i++){
            if(st.get(i)!=0){
                ans=ans*10+st.get(i);
                ans*=u;
                i++;
                break;

            }
            else{
                u=u*10;

            }

        }
        for(int j=i; j<st.size(); j++){
            ans=ans*10+st.get(j);

        }
        return ans;


        
    }
}