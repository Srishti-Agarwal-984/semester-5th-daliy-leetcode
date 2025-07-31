// Last updated: 7/31/2025, 5:36:52 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ab = new ArrayList<Integer>();
        
        long i=0, row=rowIndex;
        long ncr=1;
        long star =rowIndex;
        while(i<star) {
        	/*if(i==star-1) {
        		ncr=1;
        	}*/
        	ab.add((int)ncr);
        	ncr=((row-i)*ncr)/(i+1);
        	i++;
        }
        ncr=1;
        ab.add((int)ncr); 
        return ab;
        
    }
}