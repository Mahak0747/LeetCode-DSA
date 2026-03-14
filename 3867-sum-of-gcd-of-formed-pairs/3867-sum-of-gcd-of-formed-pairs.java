class Solution {
    private static int gcd(int a, int b){
        while(b != 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] orig=new int[n];
        int val=nums[0];
        for(int i=0; i<n; i++){
            val=Math.max(val,nums[i]);
            orig[i]=gcd(val,nums[i]);
        }
        Arrays.sort(orig);
        long sum=0;
        int l=0; 
        int u=n-1;
        while(l<u){
            sum+=gcd(orig[l],orig[u]);
            l++;
            u--;
        }
        return sum;
    }
}