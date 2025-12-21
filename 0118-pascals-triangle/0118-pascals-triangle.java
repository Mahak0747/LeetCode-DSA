class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            long val=1;
            list.add((int)val);
            for(int j=1; j<=i; j++){
                val = val * (i - j + 1) / j;
                list.add((int)val);
            }
            ans.add(list);
        }
        return ans;
    }
}