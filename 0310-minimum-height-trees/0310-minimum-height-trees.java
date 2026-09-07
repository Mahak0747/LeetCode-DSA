class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1){
            return new ArrayList<>(List.of(0));
        }
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        int[] degree = new int[n];
        for(int[] pair:edges){
            int src=pair[1];
            int des=pair[0];
            graph[src].add(des);
            graph[des].add(src);
            degree[src]++;
            degree[des]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(degree[i]==1)queue.add(i);
        }
        int left=n;
        while (left > 2) {
            int size = queue.size();
            left -= size;
            while (size-- > 0) {
                int curr=queue.remove();
                for(int i:graph[curr]){
                    degree[i]--;
                    if(degree[i]==1)queue.add(i);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }
        return ans;
    }
}