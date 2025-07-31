// Last updated: 7/31/2025, 5:38:00 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> gh = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
//		for(int k=0; k<n; k++) {
//			print(board,k,n);
//		}
		print(board,0,n,gh);
		return gh;
		
		

	}
	public static void print(boolean[][] board, int row, int tq,List<List<String>> gh) {
		if(tq==0) {
			gh.add(Display(board));
			return;
		}
		for(int col=0; col<board[0].length; col++) {
			if(Istisafe(board,row,col)) {
				board[row][col]= true;
				// queen dec => tq--
				// change row => row++
				print(board, row+1, tq-1,gh);
				board[row][col]= false; // backtrack
			}
		}
	}
	public static boolean Istisafe(boolean[][] board, int row, int col) {
		//up
		int r = row;
		while(r>=0) {
			if(board[r][col]){
				return false;
			}
			r--;
		}
		r=row;
		// right diagonal
		int c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]){
				return false;
			}
			r--;
			c++;
		}
		// left diagonal
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]){
				return false;
			}
			r--;
			c--;
		}
		return true;
		
		
		
	}
    public static List<String> Display(boolean[][] ar){
        List<String> hj = new ArrayList<>();
        for(int i=0; i<ar.length; i++){
            String as ="";
            for(int j=0; j<ar.length; j++){
                if(ar[i][j]){
                    as+="Q";
                }
                else{
                    as+=".";
                }
            }
            hj.add(as);

        }
        return hj;
    }
    

}