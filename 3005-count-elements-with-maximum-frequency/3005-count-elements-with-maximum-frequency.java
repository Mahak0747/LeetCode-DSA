class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];  // adjust size based on constraints
        int maxFreq = 0, count = 0;

        for (int num : nums) {
            freq[num]++;

            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
                count = freq[num];      // reset
            } else if (freq[num] == maxFreq) {
                count += freq[num];     // add another max-freq group
            }
        }
        return count;
    }
}
