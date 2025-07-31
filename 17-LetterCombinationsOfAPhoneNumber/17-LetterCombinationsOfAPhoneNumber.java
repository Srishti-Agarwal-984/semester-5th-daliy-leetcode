// Last updated: 7/31/2025, 5:38:42 PM
class Solution {
    static String [] key = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        
        
        // String ques = "23";
		ArrayList<String> as = new ArrayList<String>();
        if(digits.length()==0){
            return as;
        }
		
		print(digits, "", as);
        return as;
		
		

	}
	public static void print(String digits, String ans, List<String> as) {
		if(digits.length()==0){
			as.add(ans);
			return;
		}
		char ch = digits.charAt(0);
		String getstring = key[ch-'0'];
		for(int i=0; i<getstring.length(); i++) {
			print(digits.substring(1), ans+getstring.charAt(i),as);
		}
	}

}
