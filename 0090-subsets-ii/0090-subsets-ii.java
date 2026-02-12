class Solution {
    static HashSet<List<Integer>> ans;
    private static void powerset(ArrayList<Integer> list,int[] arr,int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        powerset(list,arr,i+1);
        list.remove(list.size()-1);
        powerset(list,arr,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans=new HashSet<>();
        Arrays.sort(nums);
        powerset(new ArrayList<>(),nums,0);
        return new ArrayList<>(ans);
    }
}