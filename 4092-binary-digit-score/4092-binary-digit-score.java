class Solution {
    public int calculateScore(int a, int b) {
        a=Integer.bitCount(a);
        b=Integer.bitCount(b);
        return a>=b?a*b:b/a;
    }
}