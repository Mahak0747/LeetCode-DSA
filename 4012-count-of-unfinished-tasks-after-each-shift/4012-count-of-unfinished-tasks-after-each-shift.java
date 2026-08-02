class Solution {
    private static int UB(long[] pre,long a){
        int l=0;
        int r=pre.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(pre[mid]<=a)l=mid+1;
            else r=mid;
        }
        return l;
    }
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        int m=shifts.length;
        long[] pre=new long[n+1];
        for(int i=0; i<n; i++)pre[i+1]=pre[i]+tasks[i];
        long t=pre[n];
        int[] ans=new int[m];
        long idx=0;
        for(int i=0; i<m; i++){
            idx+=shifts[i];
            if(idx>=t){
                ans[i]=0;
                idx=0;
                continue;
            }
            int done=UB(pre,idx)-1;
            ans[i]=n-done;
        }
        return ans;
    }
}