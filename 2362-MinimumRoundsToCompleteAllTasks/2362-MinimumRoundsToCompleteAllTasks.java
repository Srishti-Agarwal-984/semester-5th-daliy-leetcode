// Last updated: 7/31/2025, 5:29:05 PM
class Solution {
    public int minimumRounds(int[] tasks) {
        int c=1;
        Arrays.sort(tasks);
        int ans=0;
        for(int i=0; i<tasks.length-1; i++){
            if(tasks[i]==tasks[i+1]){
                c++;
            }
            else{
                if(c==1){
                    return -1;
                }
                if(c%3==0){
                    ans=ans+c/3;
                }
                if(c%3==1){
                    ans=ans+(c/3)-1+2;
                }
                if(c%3==2){
                    ans=ans+c/3+1;
                }
                c=1;

            }
        }
        if(c==1){
            return -1;
        }
        if(c%3==0){
            ans=ans+c/3;
        }
        if(c%3==1){
            ans=ans+(c/3)-1+2;
        }
        if(c%3==2){
            ans=ans+c/3+1;
        }
        return ans;
        
    }
}