// Last updated: 7/31/2025, 5:33:04 PM
class Solution {
    public boolean canTransform(String start, String result) {
        if(start.length()==1){
            return start.charAt(0)==result.charAt(0);
        }
        int i=0, j=0;
        while(i<start.length() && j<start.length() ){
            char s= start.charAt(i);
            char r = result.charAt(j);
            if(s=='X'){
                i++;
                continue;
            }
            if(r=='X'){
                j++;
                continue;
            }
            else if(s=='L' && r=='L'){
                if(i>=j){
                    i++;
                    j++;
                }
                else{
                    return false;
                }
            }else if(s=='R' && r=='R'){
                if(j>=i){
                    i++;
                    j++;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            } 
        }
        while(i<start.length()){
            if(start.charAt(i)!='X'){
                return false;
            }
            i++;
        }
        while(j<start.length()){
            if(result.charAt(j)!='X'){
                return false;
            }
            j++;
        }
        return true;
    }
}