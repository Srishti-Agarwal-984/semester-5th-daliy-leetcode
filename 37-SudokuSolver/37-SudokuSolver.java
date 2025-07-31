// Last updated: 7/31/2025, 5:38:18 PM
class Solution {
    public void solveSudoku(char[][] board) {
        Print(board, 0, 0);

    }

    public static boolean Print(char[][] board, int row, int col) {
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			return true;
		}
		if(board[row][col]!='.'){
			return Print(board, row, col+1);
		}
		else {
			for(int val=1; val<=9; val++) {
				if(isitsafe(board, row, col, val)) {
					board[row][col]=(char)(val+48);
					boolean ans = Print(board, row, col+1);
					if(ans==true) {
						return true;
					}
					board[row][col]='.';
				}
			}
		}
		return false;
	}
	public static boolean isitsafe(char[][]board, int row ,int col, int val) {
		//ro
		for(int i=0; i<9; i++) {
			if(board[row][i]==(char)(val+48)) {
				return false;
			}
		}
		//col
		for(int i=0; i<9; i++) {
			if(board[i][col]==(char)(val+48)) {
				return false;
			}
		}
		// 3*3
		int r = row-row%3;
		int c = col-col%3;
		for(int i=r; i<r+3; i++) {
			for(int j=c; j<c+3; j++) {
				if(board[i][j]==(char)(val+48)) {
					return false;
				}
			}
		}
		return true;
		
	} 
	
	

}
