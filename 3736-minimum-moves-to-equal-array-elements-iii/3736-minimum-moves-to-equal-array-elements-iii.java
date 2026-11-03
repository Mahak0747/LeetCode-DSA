class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        long moves = 0;
        for (int i=0; i<nums.length-1; i++) {
            moves += max-nums[i];
        }
        return (int) moves;
    }
}