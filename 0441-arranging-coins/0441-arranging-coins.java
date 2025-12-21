class Solution {
    public int arrangeCoins(int n) {
        int row=-1;
        int i=1;
        while(n>=0){
            n-=i;
            row++;
            i++;
        }
        return row;
    }
}