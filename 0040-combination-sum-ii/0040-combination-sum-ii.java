class Solution {
    static List<List<Integer>> list;
    private static void subsequence(int[] arr, int t, ArrayList<Integer> ans, int idx){
        if(t==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > t) break;
            ans.add(arr[i]);
            subsequence(arr,t-arr[i],ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        list = new ArrayList<>();
        subsequence(candidates, target, new ArrayList<>(),0);
        return list;
    }
}