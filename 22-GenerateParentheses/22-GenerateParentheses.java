// Last updated: 7/31/2025, 5:38:38 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        //ArrayList<String> as = new ArrayList<String>();
        List<String> ll = new ArrayList<>();
		
		ans1(n,0,0,"", ll);
        return ll;

	}
	public static void ans1(int n, int closed, int open, String ans, List<String> ll){
        if(open==n && closed== n){
            ll.add(ans);
            return;
        }
        if(open>n || closed>open){
            return;
        }
        ans1(n,closed, open+1, ans+"(",ll);
        ans1(n,closed+1, open, ans+")", ll);


    }

}