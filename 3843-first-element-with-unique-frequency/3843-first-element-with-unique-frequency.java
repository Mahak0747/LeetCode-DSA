class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x: map.values()){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(freq.get(map.get(nums[i]))==1)return nums[i];
        }
        return -1;
    }
}