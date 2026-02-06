class Solution {
    private static boolean safe(char[][] board,int r,int c,char v){
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == v) return false;
            if (board[r][i] == v) return false;
        }
        //grid
        int row=(r/3)*3;
        int col=(c/3)*3;
        for(int i=row;i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(board[i][j]==v)return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    char v = board[r][c];
                    board[r][c] = '.';      
                    if (!safe(board, r, c, v)) return false;
                    board[r][c] = v;      
                }
            }
        }
        return true;
    }
}