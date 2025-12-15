class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        if (n <= 1) return n;
        long ans = n;
        long count=0;
        for(int i=1; i<n; i++){
            if(prices[i]==prices[i-1]-1){
                count++;
            }
            else{
                ans += count * (count + 1) / 2;
                count=0;
            }
        }
        ans += count * (count + 1) / 2;
        return ans;
    }
}