// Last updated: 7/31/2025, 5:28:15 PM
class Solution {
    public int splitNum(int num) {
        List<Integer> as = new ArrayList<>();
        while(num!=0){
            as.add(num%10);
            num/=10;
        }
        Collections.sort(as);
        int n1=0, n2=0;
        for(int i=0; i<as.size(); i+=2){
            n1=n1*10+as.get(i);
        }
        for(int i=1; i<as.size(); i+=2){
            n2=n2*10+as.get(i);
        }
        return n1+n2;
        
    }
}