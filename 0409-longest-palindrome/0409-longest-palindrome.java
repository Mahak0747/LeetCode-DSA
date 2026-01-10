class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128]; 
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        int ans=0;
        boolean is=false;
        for (int count : arr) {
            ans += (count / 2) * 2; 
            if (count % 2 == 1) {
                is = true;
            }
        }
        if(is)ans++;
        return ans;
    }
}