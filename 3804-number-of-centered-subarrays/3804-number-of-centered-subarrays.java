class Solution {
    public int centeredSubarrays(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            HashSet<Integer> set=new HashSet<>();
            for(int j=0; i-j>=0&&i+j<nums.length; j++){
                if(j==0){
                    sum=nums[i];
                    set.add(nums[i]);
                }
                else{
                    sum+=nums[i-j]+nums[i+j];
                    set.add(nums[i-j]);
                    set.add(nums[i+j]);
                }
                if(set.contains(sum))ans++;
            }
        }
        for (int left = 0; left < nums.length - 1; left++) {
            int sum = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int l = left, r = left + 1; l >= 0 && r < nums.length; l--, r++) {
                sum += nums[l] + nums[r];
                set.add(nums[l]);
                set.add(nums[r]);
                if (set.contains(sum)) ans++;
            }
        }
        return ans;
    }
}