class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int duplicates = 0;
        for (int v : freq.values()) {
            if (v >= 2) duplicates++;
        }
        if (duplicates==0)return 0;
        int ans=0;
        int i=0;
        while(i<nums.length && duplicates>0){
            ans++;
            for(int j=0; j<3 && i<nums.length; j++){
                freq.put(nums[i],freq.get(nums[i])-1);
                if(freq.get(nums[i])==1)duplicates--;
                i++;
            }
        }
        return ans;
    }
}