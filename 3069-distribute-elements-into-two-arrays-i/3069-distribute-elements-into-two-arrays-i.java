class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();  
        ArrayList<Integer> arr2=new ArrayList<>();  
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int n=2; n<nums.length; n++){
            int a=arr1.get(arr1.size()-1);
            int b=arr2.get(arr2.size()-1);
            if(a>b)arr1.add(nums[n]);
            else arr2.add(nums[n]);
        }
        ArrayList<Integer> merged = new ArrayList<>();
        merged.addAll(arr1);
        merged.addAll(arr2);
        int[] ans = new int[merged.size()];
        for (int i = 0; i < merged.size(); i++) {
            ans[i] = merged.get(i);
        }
        return ans;
    }
}