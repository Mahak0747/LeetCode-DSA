class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans  = 0;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            ans  =  Math.max(ans , min*(j-i));
            while(i<j &&  height[i]<=min) i++;
            while(i<j &&  height[j]<=min) j--;
        } 
        return ans;
    }
}