class Solution {
    private static int gcd(int a,int b) {
        while(b!=0) {
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int l=0;
        int ans=Math.min(n, 2);
        while(l<n){
            int r=l;
            while(r<n){
                boolean is=true;
                for(int i=l;i<r;i++){
                    if(gcd(nums[i],nums[r])>1){
                        is=false;
                        break;
                    }
                }
                if(!is) break;
                ans=Math.max(ans,r-l+1);
                r++;
            }
            l++;
        }
        return ans;
    }
}