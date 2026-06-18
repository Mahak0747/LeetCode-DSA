class Solution {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int len=points.length;
        boolean[] seen = new boolean[points.length];
        pq.add(new int[]{0,0});
        int sum=0;
        int count=0;
        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            int c=curr[0];
            int p=curr[1];
            if(seen[p])continue;
            seen[p]=true;
            sum+=c;
            count++;
            if(count == len)return sum;
            for(int i=0; i<len; i++){
                if(!seen[i]){
                    int dist = Math.abs(points[p][0] - points[i][0])+ Math.abs(points[p][1] - points[i][1]);
                    pq.add(new int[]{dist, i});
                }
            }
        }
        return sum;
    }
}