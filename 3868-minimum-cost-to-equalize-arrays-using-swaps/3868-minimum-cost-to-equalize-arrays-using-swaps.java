class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(i%2==1)return -1;
        }
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i:nums1){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)-1);
        }
        int ans=0;
        for(int i:map2.values()){
            ans+=Math.abs(i);
        }
        return ans/4;
    }
}