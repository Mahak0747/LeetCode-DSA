class Solution {
    private static void findCircleNumUtil(int[][] graph,int idx, boolean seen[]){
        seen[idx]=true;
        for(int i=0; i<graph.length; i++){
            if(graph[idx][i]==1&&!seen[i]){
                findCircleNumUtil(graph,i,seen);
            }
        }
    }
    public int findCircleNum(int[][] graph) {
        int c=0;
        boolean seen[]=new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!seen[i]){
                findCircleNumUtil(graph,i,seen);
                c++;
            }
        }
        return c;
    }
}