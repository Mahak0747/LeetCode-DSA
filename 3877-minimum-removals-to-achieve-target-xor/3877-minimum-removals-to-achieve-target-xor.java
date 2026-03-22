class Solution {
    public int minRemovals(int[] nums, int target) {
        HashMap<Integer,Integer> f=new HashMap<>();
        f.put(0,0);
        for(int n:nums){
            HashMap<Integer,Integer> temp=new HashMap<>(f);
            for(int x:f.keySet()){
                int xor=x^n;
                int len=f.get(x)+1;
                temp.put(xor,Math.max(temp.getOrDefault(xor,0),len));
            }
            f=temp;
        }
        if(!f.containsKey(target))return -1;
        return nums.length-f.get(target);
    }
}