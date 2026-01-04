class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr={0,0};
        for(int i:nums){
            if(set.contains(i))arr[0]=i;
            set.add(i);
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}