class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n=nums.length;
        List<Long> l=new ArrayList<>();
        for(int i=0; i<n; i++){
            long val=nums[i];
            while(!l.isEmpty()&&val==l.get(l.size()-1)){
                val+=l.remove(l.size()-1);
            }
            l.add(val);
        }
        return l;
    }
}