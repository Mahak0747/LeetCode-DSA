class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int x=center[0];
        int y=center[1];
        int max= Integer.MIN_VALUE;
        int[] ans={-1,-1};
        for(int i=0; i<towers.length; i++){
            int X=towers[i][0];
            int Y=towers[i][1];
            int q=towers[i][2];
            int dist=Math.abs(x-X)+Math.abs(y-Y);
            if (dist <= radius) {
                if (q>max||(q == max && (X < ans[0] || (X == ans[0] && Y < ans[1])))) {
                    max = q;
                    ans[0] = X;
                    ans[1] = Y;
                }
            }
        }
        return ans;
    }
}