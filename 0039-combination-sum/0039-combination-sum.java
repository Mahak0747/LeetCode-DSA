class Solution {
    static List<List<Integer>> list;
    private static void subsequence(int[] arr, int t, ArrayList<Integer> ans, int i){
        if(t==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(i==arr.length||t<0)return;
        ans.add(arr[i]);
        subsequence(arr,t-arr[i],ans,i);
        ans.remove(ans.size()-1);
        subsequence(arr,t,ans,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        subsequence(candidates,target,new ArrayList<>(),0);
        return list;
    }
}