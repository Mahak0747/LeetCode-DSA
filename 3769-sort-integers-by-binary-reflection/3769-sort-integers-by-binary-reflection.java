import java.util.*;

class Solution {
    private int reflect(int num){
        String binary = Integer.toBinaryString(num);
        String rev = new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(rev, 2);
    }

    public int[] sortByReflection(int[] nums) {
        int n = nums.length;

        // Create array of indices to preserve original numbers
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        Arrays.sort(indices, (a, b) -> {
            int reflA = reflect(nums[a]);
            int reflB = reflect(nums[b]);
            if (reflA != reflB) return reflA - reflB;   // sort by reflected value
            return nums[a] - nums[b];                  // tie-break by original number
        });

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = nums[indices[i]];
        return ans;
    }
}
