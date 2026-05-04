class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int ev = 0, od = 0;
        int[] arr=new int[n];
        for(int i=n-1; i>=0; i--){
            if(nums[i]%2==0){
                arr[i]=od;
                ev++;
            }
            else{
                arr[i]=ev;
                od++;
            }
        }
        return arr;
    }
}