// Last updated: 10/21/2025, 3:15:06 PM
class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] d=new int[security.length];
        int[] in=new int[security.length];
        d[0]=1;
        in[0]=1;
        int dec=1,inc=1;
        for(int i=1;i<security.length; i++){
            if(security[i]<=security[i-1]){
                dec++;
                d[i]=dec;
            }
            else{
                dec=1;
            }
            if(security[i]>=security[i-1]){
                inc++;
                in[i]=inc;
            }
            else{
                inc=1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = time;i<security.length-time;i++){
            if((d[i] >= time+1 && in[i+time] >= time+1) || time == 0) res.add(i);
        }
        return res;
    }
}
