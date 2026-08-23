class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n))continue;
            List<Integer> pf=new ArrayList<>();
            int temp=n;
            for(int i=2; i*i<=temp ;i++){
                if(temp%i==0){
                    pf.add(i);
                    while(temp%i==0){
                        temp/=i;
                    }
                }
            }
            if(temp>1)pf.add(temp);
            map.put(n,pf);
        }
        HashMap<Integer,Integer> map2=new HashMap<>();
        int l=0;
        int dis=0;
        int ans=0;
        for(int r=0; r<nums.length; r++){
            for(int i:map.get(nums[r])){
                if(!map2.containsKey(i)){
                    map2.put(i,1);
                    dis++;
                }
                else map2.put(i,map2.get(i)+1);
            }
            while(dis>k){
                for(int i:map.get(nums[l])){
                    map2.put(i,map2.get(i)-1);
                    if(map2.get(i)==0){
                        map2.remove(i);
                        dis--;
                    }
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}