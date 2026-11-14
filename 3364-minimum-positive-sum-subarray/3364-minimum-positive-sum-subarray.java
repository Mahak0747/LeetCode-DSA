class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len = nums.size();
        int min = Integer.MAX_VALUE;
        for(int j = l; j <= r; j++){
            int sum = 0;
            for(int i=0; i<j; i++)
                sum += nums.get(i);
            min = (sum > 0) ? Math.min(sum, min) : min;
            int temp = sum;
            for(int i=j; i<len; i++){
                temp += nums.get(i) - nums.get(i-j);
                min = (temp > 0) ? Math.min(temp, min) : min;
            }
        }
        return (min != Integer.MAX_VALUE) ? min : -1;
    }
}