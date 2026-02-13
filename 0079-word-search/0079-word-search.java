class Solution {
    private boolean dfs(char[][] board, String word,int x,int y,int i) {
        if(i==word.length())return true;
        if (x<0 || y<0 || x>=board.length || y>=board[0].length || board[x][y]!=word.charAt(i)) return false;
        char temp=board[x][y];
        board[x][y]='#';
        boolean found = dfs(board,word,x+1,y,i+1)||
                        dfs(board,word,x-1,y,i+1)||
                        dfs(board,word,x,y+1,i+1)||
                        dfs(board,word,x,y-1,i+1);
        board[x][y]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]==word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}