class Solution {
    public int mirrorDistance(int n) {
        String str=Integer.toString(n);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        str=sb.toString();
        return Math.abs(n-Integer.parseInt(str));
    }
}