class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>(); 
        for(int i=0; i<nums.length; i++){
            if (!list.contains(nums[i])) {  
                list.add(nums[i]);
            }
        }        
        if(list.size()>=3){
            return list.get(list.size()-3);
        }
        else if(list.size()==2){
            return Math.max(list.get(0),list.get(1));
        }
        return list.get(0);
    }
}