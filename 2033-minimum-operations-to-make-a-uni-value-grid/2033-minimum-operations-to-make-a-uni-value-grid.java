class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int rem = grid[0][0] % x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] % x != rem) return -1;
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int mid = list.get(list.size() / 2);
        int ans = 0;
        for (int val : list) {
            ans += Math.abs(val - mid) / x;
        }
        return ans;
    }
}