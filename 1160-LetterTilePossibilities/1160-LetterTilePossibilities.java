// Last updated: 7/31/2025, 5:31:58 PM
import java.util.*;
class Solution {
    static HashSet<String> ar = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        //HashSet<String> ar = new HashSet<>();
        comb1(tiles,"");
        int r = ar.size();
        ar = new HashSet<>();
        return r-1;
        
    }
    public static void comb1(String tiles,String an){
        if(tiles.length()==0){
            comb2(an,"");
            return;
        }
        for(int i=0; i<tiles.length(); i++){
            if(!IsValid(tiles,i+1,tiles.charAt(i))) {
				String ab =tiles.substring(0,i)+tiles.substring(i+1, tiles.length());
				comb1(ab, an+tiles.charAt(i));
				
			}
        }
    }
    public static void comb2(String tiles,String an){
        if(tiles.length()==0){
            ar.add(an);
            return;
        }
        char ch = tiles.charAt(0);
        comb2(tiles.substring(1), an);
        comb2(tiles.substring(1), an+ch);

    }
    public static boolean IsValid(String ques,int i, char ch1) {
		
		for(int j =i ; j<ques.length(); j++) {
			if(ques.charAt(j) == ch1) {
				return true;
			}
		}
		return false;
		
		
	}

}