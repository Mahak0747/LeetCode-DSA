class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,map.get(i));
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int k:map.keySet()){
            if(map.get(k)==max){
                list.add(k);
            }
        }
        int ans=nums.length;
        for(int i:list){
            int l=0;
            while(nums[l]!=i){
                l++;
            }
            int r=nums.length-1;
            while(nums[r]!=i){
                r--;
            }
            ans=Math.min(ans,r-l+1);
        }
        return ans;
    }
}