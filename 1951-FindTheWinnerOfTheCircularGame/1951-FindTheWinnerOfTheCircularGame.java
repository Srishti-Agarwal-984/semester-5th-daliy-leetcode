// Last updated: 7/31/2025, 5:30:06 PM
class Solution {
    public int findTheWinner(int n, int k) {
        int g=n;
        List<Integer> kl = new ArrayList<>();
        for(int i=0; i<n; i++){
            kl.add(i+1);
        }
        comb(kl, k, 1);
        return kl.get(0);
    }
    public static void comb(List<Integer> kl, int k, int si){
        if(kl.size()==1){
            return;
        }
        int a= kl.indexOf(si);
        int c=0;
        while(c!=k-1){
            if(a==kl.size()-1){
                a=0;
                c++;
                continue;
            }
            a++;
            c++;
        }
        int u=0;
        if(a==kl.size()-1){
            u=kl.get(0);
        }
        else{
            u=kl.get(a+1);
        }
        kl.remove(a);
        //System.out.println(kl);
        comb(kl,k,u);
    }
}