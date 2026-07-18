class Solution {
    private int gcd(int a, int b) {
        while (b != a) {
            if (b >= a) b -= a;
            else a -= b;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return gcd(min,max);
    }
}