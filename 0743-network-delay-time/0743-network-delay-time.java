class Pair implements Comparable<Pair>{
    int node;
    int cost;
    public Pair(int n, int c){
        this.node=n;
        this.cost=c;
    }
    @Override
    public int compareTo(Pair other){
        return this.cost - other.cost;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Pair>[] graph=new ArrayList[n+1];
        for(int i=0; i<=n; i++)graph[i]=new ArrayList<>();
        for(int[] i:times)graph[i[0]].add(new Pair(i[1],i[2]));
        int[] ans=new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int N=curr.node;
            int c=curr.cost;
            for(int i=0; i<graph[N].size(); i++){
                Pair e=graph[N].get(i);
                if(e.cost+c<ans[e.node]){
                    ans[e.node]=e.cost+c;
                    pq.add(new Pair(e.node,e.cost+c));
                }
            }
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
            if(ans[i] == Integer.MAX_VALUE)return -1;
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}