class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int l=1;
        int count=1;
        int x=nums[0];
        for(int i=1; i<nums.length; i++){
            if(x==nums[i]){
                continue;
            }
            else if(x+1==nums[i]){
                count++;
                x=nums[i];
            }
            else if(x!=nums[i]){
                count=1;
                x=nums[i];
            }
            l=Math.max(count,l);
        }
        return l;
    }
}