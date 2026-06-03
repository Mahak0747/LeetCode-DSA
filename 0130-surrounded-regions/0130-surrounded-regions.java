class Pair{
    int i,j;
    public Pair(int i, int j){
        this.i=i; this.j=j;
    }
}
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<Pair> q=new LinkedList<Pair>();
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='O'&& (i==0 || j==0 || i==n-1 || j==m-1))q.add(new Pair(i,j));
            }
        }
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.remove();
            int r=curr.i;
            int c=curr.j;
            board[r][c]='p';
            for(int i=0; i<4; i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && board[nr][nc]=='O'){
                    q.add(new Pair(nr,nc));
                    board[nr][nc]='p';
                }
            }
        }
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='p')board[i][j]='O';
                else board[i][j]='X';
            }
        }
    }
}