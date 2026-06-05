class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        ArrayList<Integer> list=new ArrayList<>();
        int val=nums[0];
        int c=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=val){
                int cunt=Math.min(c,k);
                while(cunt-->0){
                    list.add(val);
                }
                val=nums[i];
                c=1;
            }
            else c++;
        }
        int cnt = Math.min(c, k);
        while (cnt-- > 0) {
            list.add(val);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}