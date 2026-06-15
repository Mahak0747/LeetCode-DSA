class Pair implements Comparable<Pair>{
    int node;
    long cost;
    public Pair(int n, long c){
        this.node=n;
        this.cost=c;
    }
    @Override
    public int compareTo(Pair other){
        return Long.compare(this.cost, other.cost);
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<Pair>[] graph=new ArrayList[n];
        for(int i=0; i<n; i++)graph[i]=new ArrayList<>();
        for(int[] i:roads){
            graph[i[0]].add(new Pair(i[1],i[2]));
            graph[i[1]].add(new Pair(i[0],i[2]));
        }
        long[] reach=new long[n];
        reach[0]=1;
        long[] ans=new long[n];
        Arrays.fill(ans, Long.MAX_VALUE);
        ans[0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int MOD = 1000000007;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int N=curr.node;
            long c=curr.cost;
            if(c > ans[N]) continue;
            for(int i=0; i<graph[N].size(); i++){
                Pair e=graph[N].get(i);
                if(e.cost+c<ans[e.node]){
                    ans[e.node]=e.cost+c;
                    pq.add(new Pair(e.node,e.cost+c));
                    reach[e.node]=reach[N];
                }
                else if(e.cost+c==ans[e.node])reach[e.node]=(reach[N]+reach[e.node])% MOD;
            }
        }
        return (int)reach[n-1];
    }
}