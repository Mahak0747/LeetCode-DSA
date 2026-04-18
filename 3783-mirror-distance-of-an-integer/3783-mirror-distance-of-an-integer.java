class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int r=0;
        while(n>0){
            r = r * 10 + (n % 10);
            n/=10;
        }
        return Math.abs(temp-r);
    }
}