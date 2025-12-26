class Solution {
    public int bestClosingTime(String c) {
        int penalty = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'Y') penalty++;
        }
        int minPenalty = penalty;
        int ans = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'Y') {
                penalty--;  
            } else {
                penalty++;   
            }
            if (penalty < minPenalty) {
                minPenalty = penalty;
                ans = i + 1;
            }
        }
        return ans;
    }
}
