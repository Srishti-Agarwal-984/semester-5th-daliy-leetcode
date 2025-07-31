// Last updated: 7/31/2025, 5:29:54 PM
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i=0; i<chalk.length; i++){
            sum=sum+chalk[i];
        }
        long v = k-((k/sum)*sum);
        long u=0;
        for(int i=0; i<chalk.length; i++){
            if(chalk[i]>v){
                u=i;
                break;
            }
            v=v-chalk[i];
        }
        
        return (int)u;
        
    }
}