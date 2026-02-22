class Solution {
    public int binaryGap(int n) {
        int idx = -1;
        int max = 0;
        int neww = 0;
        while(n>0){
            if ((n & 1) == 1) {
                if (idx != -1) {
                    max = Math.max(max, neww-idx);
                }
                idx=neww;
            }
            n >>= 1;
            neww++;
        }
        return max;
    }
}