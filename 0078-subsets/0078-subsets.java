class Solution {
    static List<List<Integer>> ans;
    private static void subsets(ArrayList<Integer> list,int[] arr, int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        subsets(list,arr,i+1);
        list.remove(list.size()-1);
        subsets(list,arr,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        subsets(new ArrayList<>(),nums,0);
        return ans;
    }
}