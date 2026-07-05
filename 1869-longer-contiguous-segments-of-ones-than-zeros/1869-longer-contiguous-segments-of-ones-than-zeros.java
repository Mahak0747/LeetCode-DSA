class Solution {
    public boolean checkZeroOnes(String s) {
        int maxZ = 0;
        int currZ = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                currZ++;
                maxZ = Math.max(maxZ, currZ);
            } else {
                currZ = 0;
            }
        }

        int maxO = 0;
        int currO = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currO++;
                maxO = Math.max(maxO, currO);
            } else {
                currO = 0;
            }
        }

        return maxO > maxZ;
    }
}