class Solution {
    private long ans = Long.MAX_VALUE;

    private void dfs(TreeNode root, int min) {
        if (root == null) return;

        if (root.val > min) {
            ans = Math.min(ans, root.val);
            return;
        }

        dfs(root.left, min);
        dfs(root.right, min);
    }

    public int findSecondMinimumValue(TreeNode root) {
        ans = Long.MAX_VALUE;

        dfs(root, root.val);

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}