class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int sumA = 0, sumB = 0;
        for (int a : alice) sumA += a;
        for (int b : bob) sumB += b;
        int diff = (sumB - sumA) / 2;
        Set<Integer> setB = new HashSet<>();
        for (int b : bob) setB.add(b);
        for (int a : alice) {
            if (setB.contains(a + diff)) {
                return new int[]{a, a + diff};
            }
        }
        return new int[]{};
    }
}