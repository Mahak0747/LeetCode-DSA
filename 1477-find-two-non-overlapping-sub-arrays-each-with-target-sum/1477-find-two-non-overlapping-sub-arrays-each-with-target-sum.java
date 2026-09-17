class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int pre[]=new int[n];
        Arrays.fill(pre,Integer.MAX_VALUE);
        int ans=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            while(sum>target){
                sum-=arr[l++];
            }
            if(sum==target){
                int len=r-l+1;
                if (l>0 && pre[l-1]!=Integer.MAX_VALUE) ans=Math.min(ans,len+pre[l-1]);
                pre[r] = len;
            }
            if(r>0) pre[r]=Math.min(pre[r],pre[r-1]);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}