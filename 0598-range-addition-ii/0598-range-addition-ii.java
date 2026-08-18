class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for(int i = 0; i < ops.length; i++){
            int x = ops[i][0];
            int y = ops[i][1];
            a = Math.min(a, x);
            b = Math.min(b, y);
        }
        return a * b;
    }
}