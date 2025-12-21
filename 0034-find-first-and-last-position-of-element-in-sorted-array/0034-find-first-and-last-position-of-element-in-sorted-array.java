class Solution {
    public int firstOccurrence(int[] nums, int target) {
        // code here
        int first=-1;
        int s=0;
        int e=nums.length-1; 
        while(s<=e){
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
           first=mid;
           e=mid-1;
        }
        else if(nums[mid]<target){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
       }
       return first;
    }
    public int lastOccurrence(int[] nums, int target) {
        // code here
        int last=-1;
        int s=0;
        int e=nums.length-1; 
        while(s<=e){
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
           last=mid;
           s=mid+1;
        }
        else if(nums[mid]<target){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
       }
       return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=firstOccurrence(nums,target);
        if(l==-1)return new int[] {-1,-1};
        int u=lastOccurrence(nums,target);
        return new int[] {l,u};
    }
}
