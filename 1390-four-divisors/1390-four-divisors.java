class Solution {
    public int divisors(int n){
        int sum=0;
        int count=0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                int d1 = i;
                int d2 = n / i;
                if (d1 == d2) {
                    count += 1;
                    sum += d1;
                } else {
                    count += 2;
                    sum += d1 + d2;
                }
                if (count > 4) return -1;
            }
        }
        return count == 4 ? sum : -1;
    }
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int sum = divisors(num);
            if (sum != -1) {
                ans += sum;
            }
        }
        return ans;
    }
}