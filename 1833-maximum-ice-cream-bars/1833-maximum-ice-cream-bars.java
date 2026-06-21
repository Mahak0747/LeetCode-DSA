class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        int spent=0;
        for(int i=0; i<costs.length; i++){
            spent+=costs[i];
            if(spent>coins)break;
            c++;
        }
        return c;
    }
}