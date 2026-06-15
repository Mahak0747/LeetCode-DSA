class Pair{
    int node;
    int cost;
    public Pair(int n, int c){
        this.node=n;
        this.cost=c;
    }
}
class Trip{
    int stops;
    int node;
    int cost;
    public Trip(int s, int n, int c){
        this.stops=s;
        this.node=n;
        this.cost=c;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Pair>[] graph=new ArrayList[n];
        for(int i=0; i<n; i++)graph[i]=new ArrayList<>();
        for(int[] i:flights)graph[i[0]].add(new Pair(i[1],i[2]));
        Queue<Trip> q=new LinkedList<>();
        q.add(new Trip(0,src,0));
        int[] ans=new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src]=0;
        while(!q.isEmpty()){
            Trip curr=q.remove();
            int stops=curr.stops;
            int loc=curr.node;
            int cost=curr.cost;
            if(stops>k)continue;
            for(int i=0; i<graph[loc].size(); i++){
                Pair e=graph[loc].get(i);
                if(e.cost+cost<ans[e.node]){
                    ans[e.node]=e.cost+cost;
                    q.add(new Trip(stops+1,e.node,e.cost+cost));
                }
            }
        }
        return ans[dst]==Integer.MAX_VALUE?-1:ans[dst];
    }
}