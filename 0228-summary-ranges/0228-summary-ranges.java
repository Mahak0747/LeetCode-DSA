class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans=new ArrayList<>();
        if(nums.length==0)return ans;
        int src=0;
        int dest=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]+1){
                if(src==dest)ans.add(nums[src]+"");
                else if(src!=dest)ans.add(nums[src]+"->"+nums[dest]);
                src=i;
            }
            dest++;
        }
        if(src==dest)ans.add(nums[src]+"");
        else if(src!=dest)ans.add(nums[src]+"->"+nums[dest]);
        return ans;
    }
}