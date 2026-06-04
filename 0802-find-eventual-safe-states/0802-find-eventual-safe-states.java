class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v = graph.length;
        ArrayList<Integer>[] rev = new ArrayList[v];
        for(int i = 0; i < v; i++)rev[i] = new ArrayList<>();
        int[] indeg = new int[v];
        for(int i = 0; i < v; i++) {
            indeg[i] = graph[i].length;  
            for(int nei : graph[i]) {
                rev[nei].add(i);        
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++)if(indeg[i] == 0) q.add(i);
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()) {
            int curr = q.remove();
            list.add(curr);
            for(int next : rev[curr]) {
                indeg[next]--;
                if(indeg[next] == 0) {
                    q.add(next);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}