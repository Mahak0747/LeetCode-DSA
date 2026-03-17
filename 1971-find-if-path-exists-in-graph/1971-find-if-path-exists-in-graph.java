class Solution {
    private static boolean dfs(int curr, List<List<Integer>> graph, boolean[] seen, int dest) {
        if (curr == dest) return true;
        seen[curr] = true;

        for (int i : graph.get(curr)) {
            if (!seen[i]) {
                if (dfs(i, graph, seen, dest)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]); 
        }
        boolean[] seen = new boolean[n];
        return dfs(source, graph, seen, destination);
    }
}