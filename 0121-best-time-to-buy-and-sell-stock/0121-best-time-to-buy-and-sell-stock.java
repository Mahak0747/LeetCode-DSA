class Solution {
    public int maxProfit(int[] prices) {
        int s = prices[0];
        int maxp=0;
        for(int i=1; i<prices.length; i++){
            if(s<prices[i]){
                int p=prices[i]-s;
                maxp=Math.max(p,maxp);
            }
            else{
                s=prices[i];
            }
        }
        return maxp;
    }
}