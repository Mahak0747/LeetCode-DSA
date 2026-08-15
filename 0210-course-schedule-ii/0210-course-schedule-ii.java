class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        int[] in=new int[n];
        for(int[] pair:prerequisites){
            graph[pair[1]].add(pair[0]);
            in[pair[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0; i<n; i++){
            if(in[i]==0)q.add(i);
        }
        int[] ans=new int[n];
        int idx=0;
        while(!q.isEmpty()){
            int curr=q.remove();
            ans[idx++]=curr;
            for(int i:graph[curr]){
                in[i]--;
                if(in[i]==0)q.add(i);
            }
        }
        if(idx == n) return ans;
        return new int[0];
    }
}