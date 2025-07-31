// Last updated: 7/31/2025, 5:34:52 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<>();
         ans(n,0,ll);
         ll.remove(0);
         return ll;

        
        
    }
    public static void ans(int n, int curr, List<Integer> ll){
    	if(curr>n) {
    		return ;
    		
    	}
    	ll.add(curr);
    	int i=0;
    	if(curr == 0) {
    		i=1;
    	}
    	for(; i<10; i++) {
    		ans(n,curr*10+i, ll);
    	}
    	
    }

}