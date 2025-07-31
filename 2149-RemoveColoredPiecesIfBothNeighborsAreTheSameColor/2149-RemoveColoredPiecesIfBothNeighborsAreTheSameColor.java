// Last updated: 7/31/2025, 5:29:43 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length()<3){
            return false;
        }
        int c=0;
        int aChance=0;
        for(int i=0; i<colors.length(); i++){
            if(colors.charAt(i)=='A'){
                c++;
            }
            else{
                if(c>=3){
                    aChance+=c-2;
                }
                c=0;
            }
        }
        if(c>=3){
            aChance+=c-2;
        }
        c=0;
        int bChance=0;
        for(int i=0; i<colors.length(); i++){
            if(colors.charAt(i)=='B'){
                c++;
            }
            else{
                if(c>=3){
                    bChance+=c-2;
                }
                c=0;
            }
        }
        if(c>=3){
            bChance+=c-2;
        }
        
        if(aChance>bChance){
            return true;
        }
        return false;
        
    }
}