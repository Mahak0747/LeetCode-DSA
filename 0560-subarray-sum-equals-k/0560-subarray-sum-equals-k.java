class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            prefixsum+=nums[i];
            int remove=prefixsum-k;
            count+=map.getOrDefault(remove, 0);
            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }
        return count;
    }
}