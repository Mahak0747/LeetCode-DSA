class Solution {
    public int[] finalPrices(int[] prices) {
        // int[] ans=prices;
        // Stack<Integer> s=new Stack<>();
        // for(int i=0; i<prices.length; i++){
        //     while(!s.isEmpty()&&prices[s.peek()]>=prices[i]){
        //         ans[s.peek()]-=prices[i];
        //         s.pop();
        //     }
        //     s.push(i);
        // }
        // return ans;
        int n = prices.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = prices[i];

            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    res[i] -= prices[j];
                    break;
                }
            }
        }
        
        return res;
    }
}