class Solution {
    static List<List<Integer>> ans;
    private static void bt(int curr ,int n, int k, ArrayList<Integer> list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(curr>n)return;
        list.add(curr);
        bt(curr+1,n,k,list);
        list.remove(list.size()-1);
        bt(curr+1,n,k,list);
    }
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        bt(1,n,k, new ArrayList<Integer>());
        return ans;
    }
}