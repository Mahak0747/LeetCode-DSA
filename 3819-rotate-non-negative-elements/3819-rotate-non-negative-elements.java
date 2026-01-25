class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        if(k==0)return nums;
        ArrayList<Integer> l=new ArrayList<>();
        for(int a:nums){
            if(a>=0)l.add(a);
        }
        if(l.size()==0)return nums;
        k=k%l.size();
        Collections.rotate(l,-k);
        int idx=0;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                nums[i]=l.get(idx);
                idx++;
            }
        }
        return nums;
    }
}