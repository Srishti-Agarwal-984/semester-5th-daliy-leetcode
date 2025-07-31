// Last updated: 7/31/2025, 5:36:28 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
		// System.out.println(s);
//		" +" multiple space removed or\s+
		String [] arr = s.split(" +");
		String ans="";
		for(int i=arr.length-1; i>=0; i--) {
			
			ans= ans +arr[i]+" ";
			
		}
		return (ans.trim());
       

        


        
    }
}