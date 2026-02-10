class Solution {
    public int longestBalanced(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            int even=0;
            int odd=0;
            HashSet<Integer> set=new HashSet<>();
            for(int j=i; j<nums.length; j++){
                if(nums[j]%2==0){
                    if(!set.contains(nums[j])){
                        set.add(nums[j]);
                        even++;
                    }
                }
                else if(!set.contains(nums[j])){
                    set.add(nums[j]);
                    odd++;
                }

                if (even == odd)c = Math.max(c, j - i + 1);
            }
        }
        return c;
    }
}