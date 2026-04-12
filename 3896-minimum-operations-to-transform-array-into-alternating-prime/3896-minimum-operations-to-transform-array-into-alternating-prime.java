class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            boolean is=isPrime(nums[i]);
            if (i % 2 == 0){
                while(!isPrime(val)){
                    val++;
                    c++;
                }
            } 
            else{
                while(isPrime(val)){
                    val++;
                    c++;
                }
            } 
        }
        return c;
    }
}