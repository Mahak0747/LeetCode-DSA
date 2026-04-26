class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        if (n == 1) {
            ans.add(nums[0]);
            return ans;
        }
        int[] f=new int[n];
        f[0]=nums[0];
        int[] b=new int[n];
        b[n-1]=nums[n-1];
        for(int i=1; i<n; i++){
            f[i]=Math.max(f[i-1],nums[i]);
        }
        for(int i=n-2; i>=0; i--){
            b[i]=Math.max(b[i+1],nums[i]);
        }
        for(int i=0; i<n; i++){
            if (i == 0 || i == n - 1) {
                ans.add(nums[i]);
            }
            else if(nums[i]>f[i-1]||nums[i]>b[i+1])ans.add(nums[i]);
        }
        return ans;
    }
}