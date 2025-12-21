class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        boolean[] fixed = new boolean[n - 1];

        for (int i = 0; i < strs[0].length(); i++) {
            boolean check = false;

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count++;
                    check = true;
                    break;
                }
            }

            if (check) continue; 

            for (int j = 0; j < n - 1; j++) {
                if (!fixed[j] && strs[j].charAt(i) < strs[j + 1].charAt(i)) {
                    fixed[j] = true;
                }
            }
        }
        return count;
    }
}
