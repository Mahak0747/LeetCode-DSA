class Pair implements Comparable<Pair>{
    int nei;
    int wt;
    public Pair(int n, int w){
        this.nei=n;
        this.wt=w;
    }
    @Override
    public int compareTo(Pair other){
        return this.wt - other.wt;
    }
}
class Solution {
    private static int dijkstra(int src, ArrayList<Pair>[] graph, int n, int distanceThreshold){
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int nn=curr.nei;
            int c=curr.wt;
            for(int i=0; i<graph[nn].size(); i++){
                Pair Neigh=graph[nn].get(i);
                if(Neigh.wt+c<dist[Neigh.nei]){
                    dist[Neigh.nei]=Neigh.wt+c;
                    pq.add(new Pair(Neigh.nei,Neigh.wt+c));
                }
            }
        }
        int c=0;
        for(int i=0; i<n; i++){
            if(i==src)continue;
            if(dist[i] <= distanceThreshold)c++;
        }
        return c;
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        ArrayList<Pair>[] graph=new ArrayList[n];
        for(int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for(int[] i:edges){
            graph[i[0]].add(new Pair(i[1],i[2]));
            graph[i[1]].add(new Pair(i[0],i[2]));
        }
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int count = dijkstra(i, graph, n, distanceThreshold);
            if(count <= min) {
                min = count;
                ans = i;
            }
        }
        return ans;
    }
}