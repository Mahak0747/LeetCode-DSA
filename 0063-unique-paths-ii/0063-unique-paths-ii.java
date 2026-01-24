class Solution {
    private static int[][] dp;
    private static int countMazeUtil(int[][] maze,int r, int c){
        if (!isSafe(maze, r, c)) return 0;
        if(r==maze.length-1&&c==maze[0].length-1)return 1;
        if (dp[r][c] != -1) return dp[r][c];
        dp[r][c] = countMazeUtil(maze, r + 1, c) + countMazeUtil(maze, r, c + 1);
        return dp[r][c];
    }
    private static boolean isSafe(int[][] maze,int r, int c){
        return r>=0 && c>=0 && r<maze.length && c<maze[0].length && maze[r][c]==0;
    }
    public int uniquePathsWithObstacles(int[][] maze) {
        int N = maze.length;
        int M = maze[0].length;
        dp = new int[N][M];
        for (int i = 0; i < N; i++)
            Arrays.fill(dp[i], -1);
        if (maze[0][0] == 1 || maze[N-1][M-1] == 1) return 0;
        return countMazeUtil(maze, 0, 0);
    }
}