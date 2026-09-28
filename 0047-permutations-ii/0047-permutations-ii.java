class Solution {
    static List<List<Integer>> ans;
    private static void rec(int[] nums, boolean[] used,List<Integer> l){
        if(l.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            l.add(nums[i]);
            rec(nums,used,l);
            l.remove(l.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,new boolean[nums.length],new ArrayList<>());
        return ans;
    }
}