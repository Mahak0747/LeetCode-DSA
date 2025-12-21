class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                return new int[] {i,map.get(val)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}