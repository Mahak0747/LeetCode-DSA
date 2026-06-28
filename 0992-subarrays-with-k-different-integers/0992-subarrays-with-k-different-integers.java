class Solution {
    private static int sw(int[] nums, int goal){
        if(goal<0)return 0;
        int l=0;
        int r=0;
        int x=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>goal){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)map.remove(nums[l]);
                l++;
            }
            x+=r-l+1;
            r++;
        }
        return x;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sw(nums,k)-sw(nums,k-1);
    }
}