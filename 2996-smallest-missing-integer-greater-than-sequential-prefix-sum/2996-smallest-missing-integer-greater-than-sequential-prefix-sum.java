class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        int ans=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1)ans+=nums[i];
            else break;
        }
        while(set.contains(ans))ans++;
        return ans;
    }
}