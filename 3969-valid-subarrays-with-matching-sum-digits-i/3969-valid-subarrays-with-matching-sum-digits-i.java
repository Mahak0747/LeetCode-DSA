class Solution {
    private static boolean valid(long sum,int x){
        int l=(int)(sum%10);
        while(sum>=10)sum/=10;
        int f=(int)sum;
        return l==x && f==x;
    }
    public int countValidSubarrays(int[] nums, int x) {
        long[] arr=new long[nums.length+1];
        for(int i=0; i<nums.length; i++)arr[i+1]=arr[i]+nums[i];
        int c=0;
        for(int l=0; l<nums.length; l++){
            for(int r=l; r<nums.length; r++){
                long sum=arr[r+1]-arr[l];
                if(valid(sum,x))c++;
            }
        }
        return c;
    }
}