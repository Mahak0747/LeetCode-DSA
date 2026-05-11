class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        for(int num:nums){
            int idx=i;
            while(num>0){
                list.add(idx,num%10);
                num/=10;
                i++;
            }
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
}