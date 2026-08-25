class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        int i=k;
        while(true){
            if(k%1==0 && !set.contains(i))return i;
            i+=k;
        }
    }
}