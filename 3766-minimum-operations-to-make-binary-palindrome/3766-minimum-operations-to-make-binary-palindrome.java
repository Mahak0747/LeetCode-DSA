class Solution {
    private int nearestBinaryPalindrome(int n) {
        int L = Integer.toBinaryString(n).length();
        int best = -1;
        int minDiff = Integer.MAX_VALUE;
    
        // generate palindromes of lengths L-1, L, L+1
        for (int len : new int[]{L-1, L, L+1}) {
            if (len <= 0) continue;
            int half = (len + 1) / 2;
            int start = 1 << (half - 1);
            int end   = 1 << half;
    
            for (int x = start; x < end; x++) {
                String s = Integer.toBinaryString(x);
                String p = (len % 2 == 0)
                        ? s + new StringBuilder(s).reverse()
                        : s + new StringBuilder(s.substring(0, s.length() - 1)).reverse();
    
                int pal = Integer.parseInt(p, 2);
                int diff = Math.abs(n - pal);
    
                if (diff < minDiff) {
                    minDiff = diff;
                    best = pal;
                }
            }
        }
    
        return best;
    }
    public int[] minOperations(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Math.abs(nearestBinaryPalindrome(nums[i])-nums[i]);
        }
        return arr;
    }
}