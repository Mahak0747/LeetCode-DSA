class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(colors[0]!=colors[i])max=Math.max(max,i);
        }
        for (int i = n-1; i >= 0; i--) {
            if (colors[i] != colors[n - 1])max = Math.max(max, (n - 1 - i));
        }
        return max;
    }
}