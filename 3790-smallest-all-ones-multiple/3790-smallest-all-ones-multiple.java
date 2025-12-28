class Solution {
    public int minAllOneMultiple(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int remainder = 0;
        boolean[] seen = new boolean[k];
        for (int digits = 1; digits <= k; digits++) {
            remainder = (remainder * 10 + 1) % k;

            if (remainder == 0) {
                return digits;
            }

            if (seen[remainder]) {
                return -1;
            }
            seen[remainder] = true;
        }
        return -1;
    }
}