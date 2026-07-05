class Solution {
    static int max=0;
    private static int differ(int num){
        int l=0;
        int s=9;
        while(num>0){
            int rem=num%10;
            l=Math.max(l,rem);
            s=Math.min(s,rem);
            num/=10;
        }
        max=Math.max(max,l-s);        
        return l-s;
    }
    public int maxDigitRange(int[] nums) {
        max = 0;
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=differ(nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length; i++){
            if(max==arr[i])ans+=nums[i];
        }
        return ans;
    }
}