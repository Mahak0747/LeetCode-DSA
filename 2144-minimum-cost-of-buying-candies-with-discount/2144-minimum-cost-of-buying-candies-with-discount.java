class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int c=2;
        for(int i=cost.length-1; i>=0; i--){
            if(c>0){
                ans+=cost[i];
                c--;
            }
            else c=2;
        }
        return ans;
    }
}