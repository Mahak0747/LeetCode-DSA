class Solution {
    public int minimumDistance(int[] nums) {
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-2;i++){
            int curr=arr[i][1];
            int next=arr[i+1][1];
            int nextnext=arr[i+2][1];
            if(arr[i][0]==arr[i+1][0] && arr[i+1][0]==arr[i+2][0]) {
                min=Math.min(min,nextnext+nextnext-curr-curr);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}