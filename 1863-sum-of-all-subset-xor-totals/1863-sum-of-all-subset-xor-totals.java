class Solution {
    static int sum;
    private static void bt(int idx ,int xor, int[] arr){
        if(idx==arr.length){
            sum+=xor;
            return;
        }
        bt(idx+1,xor^ arr[idx],arr);
        bt(idx+1,xor,arr);
    }
    public int subsetXORSum(int[] nums) {
        sum=0;
        bt(0,0,nums);
        return sum;
    }
}