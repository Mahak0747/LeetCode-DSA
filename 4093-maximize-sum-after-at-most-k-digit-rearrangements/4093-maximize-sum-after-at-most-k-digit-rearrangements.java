class Solution {
    private static long change(long a){
        char[] chars = String.valueOf(a).toCharArray();
        Arrays.sort(chars);
        long ans=0;
        for (int i = chars.length - 1; i >= 0; i--){
            ans=ans*10+(chars[i]-'0');
        }
        return ans;
    }
    public long maximizeSum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long[] arr=new long[n];
        for(int i=0; i<n; i++){
            long curr=nums[i];
            long max=change(curr);
            sum+=curr;
            arr[i]=max-curr;
        }
        Arrays.sort(arr);
        for(int i=0; i<k; i++)sum+=arr[n-1-i];
        return sum;
    }
}