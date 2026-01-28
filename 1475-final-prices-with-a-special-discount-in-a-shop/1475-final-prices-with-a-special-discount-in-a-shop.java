class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=prices;
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!s.isEmpty()&&prices[s.peek()]>=prices[i]){
                ans[s.peek()]-=prices[i];
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}