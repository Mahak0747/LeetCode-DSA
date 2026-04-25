class Solution {
    public boolean validDigit(int n, int x) {
        int c = 0;
        int temp = n;
        while (n >= 10) {
            if (n % 10 == x) c++;
            n /= 10;
        }
        if (n == x) return false;
        if (temp < 10) return false;
        if (c > 0) return true;
        return false;
    }
}