class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";  
        int n = sum / 9;
        int r = sum % 9;
        return ("9".repeat(n) + r + "0".repeat(num)).substring(0, num);
    }
}