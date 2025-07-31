// Last updated: 7/31/2025, 5:37:58 PM
class Solution {
    static int c=0;
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
//		for(int k=0; k<n; k++) {
//			print(board,k,n);
//		}
		print(board,0,n);
        int p=c;
        c=0;
		return p;
		
		

	}
	public static void print(boolean[][] board, int row, int tq) {
		if(tq==0) {
			c++;
			return;
		}
		for(int col=0; col<board[0].length; col++) {
			if(Istisafe(board,row,col)) {
				board[row][col]= true;
				// queen dec => tq--
				// change row => row++
				print(board, row+1, tq-1);
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

    

}