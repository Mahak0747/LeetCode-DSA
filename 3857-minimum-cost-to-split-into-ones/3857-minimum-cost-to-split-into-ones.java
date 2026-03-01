class Solution {
    public int minCost(int n) {
        int val=n-1;
        int ans=val*(val+1)/2;
        return ans;
    }
}