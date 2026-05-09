class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int val = 1;
        for (int num : target) {
            while (val < num) {
                ans.add("Push");
                ans.add("Pop");
                val++;
            }
            ans.add("Push");
            val++;
        }
        return ans;
    }
}