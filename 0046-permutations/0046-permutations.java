class Solution {
    static List<List<Integer>> list;
    public static void per(int[] arr,ArrayList<Integer> ans,boolean[] used) {
        if(ans.size()==arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int j=0; j<arr.length; j++){
            if(used[j])continue;
            used[j]=true;
            ans.add(arr[j]);
            per(arr,ans,used);
            ans.remove(ans.size()-1);
            used[j]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        list=new ArrayList<>();
        per(nums,new ArrayList<>(),new boolean[nums.length]);
        return list;
    }
}