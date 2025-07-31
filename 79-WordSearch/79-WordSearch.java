// Last updated: 7/31/2025, 5:37:29 PM
class Solution {
    static boolean hj = false;
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] de = new boolean[board.length][board[0].length];
                    de[i][j]= true;
                    ans(i,j,word.substring(1),board,de);
                    boolean ut = hj;
                    hj=false;
                    if(ut){
                        return ut;
                    }
                }
            }
        } 
        return false;   
    }
    public static void ans( int row, int col, String word, char[][]board,boolean[][] de){
        if(word.length()==0){
            hj=true;
            return;
        }
        int q = board.length, w = board[0].length;
        boolean l= false;
        if(row+1<q && col<w && board[row+1][col]==word.charAt(0) && !de[row+1][col]){
            //System.out.println(word);
            de[row+1][col]=true;
            ans(row+1,col,word.substring(1),board,de);
            de[row+1][col]=false;
        }
        if(row<q && col-1>=0 && board[row][col-1]==word.charAt(0) && !de[row][col-1]){
            //System.out.println(word);
            de[row][col-1]=true;
            ans(row,col-1,word.substring(1),board,de);
            de[row][col-1]=false;
        }
        if(row-1>=0 && col>=0 && board[row-1][col]==word.charAt(0) && !de[row-1][col]){
            //System.out.println(word);
            de[row-1][col]=true;
            ans(row-1,col,word.substring(1),board,de);
            de[row-1][col]=false;
        }
        if(row>=0 && col+1<w && board[row][col+1]==word.charAt(0) && !de[row][col+1]){
            //System.out.println(word);
            de[row][col+1]=true;
            ans(row,col+1,word.substring(1),board,de);
            de[row][col+1]=false;
        }
    }
}