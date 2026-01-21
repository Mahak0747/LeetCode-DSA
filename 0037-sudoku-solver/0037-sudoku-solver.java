class Solution {
    private static boolean ss(char[][] board,int r,int c){
        if(r==9)return true;
        int nextR=r,nextC=c+1;
        if(c+1==9){
            nextR=r+1;
            nextC=0;
        }
        if(board[r][c]!='.')return ss(board,nextR,nextC);
        for(int i=1; i<=9; i++){
            char ch = (char)(i + '0');
            if(safe(board,r,c,ch)){
                board[r][c]=ch;
                if(ss(board,nextR,nextC)){
                    return true;
                }
                board[r][c]='.';
            }
        }
        return false;
    }
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
    public void solveSudoku(char[][] board) {
        ss(board,0,0);
    }
}