class Solution {
    private static boolean bfs(int[][] graph, int[] color, int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        color[start]=0;
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int n:graph[curr]){
                if(color[n]==-1){
                    color[n]=1-color[curr];
                    q.add(n);
                }
                else if(color[n]==color[curr])return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        for(int i=0; i<graph.length; i++)color[i]=-1;
        for(int i=0; i<graph.length; i++){
            if(color[i]==-1){
                if(!bfs(graph,color,i))return false;
            }
        }
        return true;
    }
}