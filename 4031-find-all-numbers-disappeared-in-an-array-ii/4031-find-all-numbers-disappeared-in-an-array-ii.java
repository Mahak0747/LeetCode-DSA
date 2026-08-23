class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums)set.add(i);
        ArrayList<Integer> missing=new ArrayList<>();
        while(lower<=upper){
            if(!set.contains(lower))missing.add(lower);
            lower++;
        }
        List<List<Integer>> ans=new ArrayList<>();
        if(missing.size()==0)return ans;
        int l=0;
        for(int r=1; r<missing.size(); r++){
            if (missing.get(r) != missing.get(r - 1) + 1) {
                ans.add(Arrays.asList(missing.get(l),missing.get(r-1)));
                l=r;
            }
        }
        ans.add(Arrays.asList(missing.get(l),missing.get(missing.size()-1)));
        return ans;
    }
}