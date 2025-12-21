class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int lp=0;
        int rp=n-1;
        
        while(lp<=rp){
            if(numbers[lp]+numbers[rp]==target){
                arr[0]=lp+1;
                arr[1]=rp+1;
                return arr;
            }
            else if(numbers[lp]+numbers[rp]>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return arr;
    }
}