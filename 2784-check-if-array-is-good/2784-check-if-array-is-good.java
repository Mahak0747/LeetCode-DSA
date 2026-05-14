class Solution {
    public boolean isGood(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            if(set.contains(i)&& i!=nums.length-1 || i>=nums.length ||i<1)return false;
            else set.add(i);
        }
        return set.size()!=nums.length-1?false:true;
    }
}