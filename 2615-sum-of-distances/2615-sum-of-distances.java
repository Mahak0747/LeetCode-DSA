class Solution {
    public long[] distance(int[] nums) {
        int N = nums.length;
        long[] res = new long[N];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (ArrayList<Integer> list : map.values()) {
            int n = list.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int idx = list.get(i);
                res[idx] += (long) i * idx - sum;
                sum += idx;
            }
            sum = 0;
            for (int i = n-1; i >= 0; i--) {
                int idx = list.get(i);
                res[idx] += sum - (long)(n - 1 - i) * idx;
                sum += idx;
            }
        }

        return res;
    }
}