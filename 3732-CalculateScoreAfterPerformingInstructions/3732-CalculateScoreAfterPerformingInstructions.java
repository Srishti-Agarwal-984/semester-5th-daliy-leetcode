// Last updated: 7/31/2025, 5:26:24 PM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int g=0;
        long ans1 =0;
        boolean[] sr = new boolean[values.length];
        while(true){
            if(g<0 || g>=values.length){
                break;    
            }
            String op = instructions[g];
            if(sr[g]==false){
                sr[g]=true;
            }
            else{
                break;
            }
            if(op.equals("jump")){
                g=g+values[g];
            }
            else{
                ans1+=values[g];
                g=g+1;
            }
        }

        return ans1;
        
    }
}
