class Solution {
    static List<List<Integer>> ans;
    private static void powerset(ArrayList<Integer> list,int[] arr,int idx){
        ans.add(new ArrayList<>(list));
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            powerset(list,arr,i+1);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        powerset(new ArrayList<>(),nums,0);
        return ans;
    }
}