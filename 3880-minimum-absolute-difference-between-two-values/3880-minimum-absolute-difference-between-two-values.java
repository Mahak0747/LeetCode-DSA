class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> two=new ArrayList();
        ArrayList<Integer> one=new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)one.add(i);
            else if(nums[i]==2)two.add(i);
        }
        if(two.size()==0||one.size()==0)return -1;
        for(int i=0; i<two.size(); i++){
            for(int j=0; j<one.size(); j++){
                min=Math.min(min,Math.abs(two.get(i)-one.get(j)));
            }
        }
        return min;
    }
}