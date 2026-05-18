class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[0] + a[1]) - (b[0] + b[1])
        );
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }
        while (k-- > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int v = curr[1];
            int j = curr[2];
            ans.add(Arrays.asList(u, v));
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{u, nums2[j + 1], j + 1});
            }
        }
        return ans;

    }
}