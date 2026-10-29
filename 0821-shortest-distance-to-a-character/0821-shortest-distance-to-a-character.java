class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int ptr1 = 0;
        while (ptr1 < n && s.charAt(ptr1) != c) ptr1++;
        int idx = 0;
        for (; idx <= ptr1; idx++) {
            ans[idx] = Math.abs(idx - ptr1);
        }
        int ptr2 = 0;
        while (ptr2 < n) {
            while (ptr1 < n && s.charAt(ptr1) != c) ptr1++;
            ptr2 = ptr1 + 1;
            while (ptr2 < n && s.charAt(ptr2) != c) ptr2++;
            while (idx < n && idx <= ptr2) {
                if (ptr2 < n) {
                    ans[idx] = Math.min(Math.abs(idx - ptr1), Math.abs(idx - ptr2));
                } else {
                    ans[idx] = Math.abs(idx - ptr1);
                }
                idx++;
            }
            ptr1 = ptr2;
        }
        return ans;
    }
}