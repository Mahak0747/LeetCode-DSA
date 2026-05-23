class Solution {
    public void reverse(int [] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                reverse(nums,0,n-1);
                reverse(nums,0,n-1-i);
                reverse(nums,n-i,n-1);
                break;
            }
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}