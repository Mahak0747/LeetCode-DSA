class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int l=0;
        int u=0;
        for(int i:nums){
            if(i<target)l++;
            else if(i==target)u++;
        }
        for(int i=0; i<u; i++){
            ans.add(l+i);
        }
        return ans;
    }
}