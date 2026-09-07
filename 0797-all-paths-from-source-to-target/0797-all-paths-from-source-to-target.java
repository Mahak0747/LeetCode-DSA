class Solution {
    static List<List<Integer>> ans;
    private static void dfs(int[][] graph, List<Integer> list,int curr){
        if(curr == graph.length-1){
            list.add(curr);
            ans.add(new ArrayList<>(list));
            list.removeLast();
            return;
        }
        for (int i=0; i < graph[curr].length;i++){
            list.add(curr);
            dfs(graph,list,graph[curr][i]);
            list.removeLast();
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList<>();
        dfs(graph,new ArrayList<>(),0);
        return ans;
    }
}