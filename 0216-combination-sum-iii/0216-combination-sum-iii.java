class Solution {
    static List<List<Integer>> ans;
    private static void powerset(ArrayList<Integer> list,int val,int sum,int k,int n){
        if(list.size()==k){
            if(sum==n)ans.add(new ArrayList<>(list));
            return;
        }
        if (sum > n || val > 9) return;
        list.add(val);
        powerset(list,val+1,sum+val,k,n);
        list.remove(list.size()-1);
        powerset(list,val+1,sum,k,n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        powerset(new ArrayList<>(),1,0,k,n);
        return ans;
    }
}