class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[][] dp=new int[map.size()][2];
        int i=0;
        for(int x:map.keySet()){
            dp[i][0]=x;
            dp[i][1]=map.get(x);
            i++;
        }
        Arrays.sort(dp,Comparator.comparingDouble(o->o[1]));
        int[] ans=new int[k];
        for(int j=0; j<k; j++){
            ans[j]=dp[map.size()-1-j][0];
        }
        return ans;
    }
}